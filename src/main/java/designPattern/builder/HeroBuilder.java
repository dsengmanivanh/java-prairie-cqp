package designPattern.builder;

public class HeroBuilder {
    private Profession profession;
    private String name;
    private HairType hairType;
    private HairColor hairColor;
    private Armor armor;
    private Weapon weapon;

    public HeroBuilder withProfession(Profession profession) {
        this.profession = profession;
        return this;
    }

    public HeroBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public HeroBuilder withHairType(HairType hairType) {
        this.hairType = hairType;
        return this;
    }

    public HeroBuilder withHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public HeroBuilder withArmor(Armor armor) {
        this.armor = armor;
        return this;
    }

    public HeroBuilder withWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public Hero build() {
        return new Hero(profession, name, hairType, hairColor, armor, weapon);
    }
}