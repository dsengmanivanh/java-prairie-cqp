package mower;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MowerService {

    private final char LEFT = 'L';
    private final char RIGHT = 'R';
    private final char FORWARD = 'F';
    private String fileName;

    private Lawn lawn;
    private Mower mower;

    public MowerService(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<Mower> play() throws FileNotFoundException {

        ArrayList<Mower> mowers = new ArrayList<>();
        ArrayList<String> commands = readFile();
        if (commands.size() == 0) {
            return mowers;
        }
        String surface = commands.get(0);
        lawn = getLawnFrom(surface);

        for (int i = 1; i < commands.size(); i = i + 2) {
            String mowerPosition = commands.get(i);
            mower = getMowerFrom(mowerPosition);
            Mower move = activateFrom(commands.get(i + 1));
            mowers.add(move);

        }
        return mowers;
    }

    private Lawn getLawnFrom(String command) {
        String[] coordinates = command.split("");
        int xMax = Integer.parseInt(coordinates[0]);
        int yMax = Integer.parseInt(coordinates[1]);
        return new Lawn(xMax, yMax);
    }

    private Mower getMowerFrom(String command) {
        String[] positions = command.split("");
        int mowerX = Integer.parseInt(positions[0]);
        int mowerY = Integer.parseInt(positions[1]);
        Direction mowerDirection = Direction.get(positions[2]);
        return new Mower(mowerX, mowerY, mowerDirection);
    }

    private Mower activateFrom(String command) {
        char[] moves = command.toCharArray();
        for (char move : moves) {
            switch (move) {
                case FORWARD:
                    mower = mower.forward(lawn);
                    break;
                case RIGHT:
                    mower = mower.onRight();
                    break;
                case LEFT:
                    mower = mower.onLeft();
                    break;
            }
        }
        return mower;
    }

    private ArrayList<String> readFile() throws FileNotFoundException {
        String line;
        String separator = "/n";
        ArrayList<String> commands = new ArrayList<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                String[] content = line.split(separator);
                String command = content[0];
                commands.add(command);
            }
        } catch (IOException e) {
            throw new FileNotFoundException();
        }
        return commands;
    }
}
