public class AgeOfUniverseAndAgeOfHumanity {

    public static void main(String args[]) {

        //неизменяемая переменная.В условиях задачи возраст Вселенной задан конкретной величиной
        final long ageOfUniverse = 13_000_000_000L; //тип данных long используется для удобства записи чисел с большим количеством нулей

        System.out.println("Возраст Вселенной составляет более " + ageOfUniverse + " лет");

        //неизменяемая переменная.В условиях задачи возраст человечества(человека как вида) задан конкретной величиной
        final long ageOfHumanity = 100_000L; //тип данных long используется для удобства записи чисел с большим количеством нулей
        System.out.println("Возраст человечества(человека как вида) составляет " + ageOfHumanity + " лет");

        double universeIsOlderHumanity = ageOfUniverse / ageOfHumanity;
        System.out.println("Вселенная старше человечества в " + universeIsOlderHumanity + " раз.");

    }
}
