package designPattern.builder;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HeroBuilderTest {

    @Test
    public void build_with_parameter() {
        //set
        HeroBuilder heroBuilder = new HeroBuilder()
                .withArmor(Armor.CLOTHES)
                .withHairColor(HairColor.BLACK)
                .withHairType(HairType.BALD)
                .withName("name")
                .withProfession(Profession.MAGE)
                .withWeapon(Weapon.AXE);
        //test
        Hero result = heroBuilder.build();
        //assert
        assertEquals(Armor.CLOTHES, result.getArmor());
    }
}