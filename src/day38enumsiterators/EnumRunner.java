package day38enumsiterators;

public class EnumRunner {
    public static void main(String[] args) {
       String capitalOfIllinois =    UnitedStatesEnum.ILLINOIS.getCapital();
       System.out.println(capitalOfIllinois);

        String abbreviationOfFlorida = UnitedStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviationOfFlorida);

        UnitedStatesEnum state = UnitedStatesEnum.ALASKA;
        System.out.println(state);

        System.out.println(UnitedStatesEnum.getStateNameByUsingAbbreviation("AK"));

        System.out.println(UnitedStatesEnum.getAbbreviationForStateName("Florida"));
    }
}
