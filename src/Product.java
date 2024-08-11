public class Product {
    public static void main(String[] args) {

        System.out.println("Version 1.0");

        developFunction();
        majorFeatureFunction();

        System.out.println("New functional");

        featureFunction();


    }

    public static void developFunction() {

        System.out.println("Start develop..");
        System.out.println("Episode 1 - The phantom menace..");
        System.out.println("Episode 2 - Attack of the clones..");

    }
    public static void majorFeatureFunction() {

        System.out.println("Restoring the balance of power..");
        System.out.println("Landing on Kashyyyk..");
        System.out.println("Rescuing the Wookiees..");
        System.out.println("Destruction of the death star..");
        System.out.println("Defeating Palpatine..");

    }

    public static void featureFunction() {

        System.out.println("Sword added");
        System.out.println("Lightsaber added");

    }
}