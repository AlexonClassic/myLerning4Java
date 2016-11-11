package OtherTasks.GMByte.Lesson9;

import OtherTasks.GMByte.Lesson9.AccessModifiersPackage.AccessModifiersClassFromPackage;

/**
 * Created by Олександр Шаповал on 11.11.2016
 *
 * Lesson - 9
 * https://youtu.be/UmKVu4xz33o?list=PLk95cAdGYXN1GYSm1NIMHJuyq_kk9Obg9
 *
 * https://docviewer.yandex.ua/?url=ya-disk-public%3A%2F%2FWRJzA1WIPQGSpsK1qOgpikP07Sl4LwzEVcat7oIksDQ%3D&name=Domashnie_zadania_k_urokam_1-_15.txt&page=2&c=5826337a13af
 */

public class AccessModifiersRunner {
    public static void main(String[] args) {
        AccessModifiersClassFromPackage accessModifiersClassFromPackage = new AccessModifiersClassFromPackage();
        AccessModifiersClassNoPackage accessModifiersClassNoPackage = new AccessModifiersClassNoPackage();

        System.out.println("---------------------------");
        System.out.println();
        System.out.println("After work, class \"AccessModifiersClassFromPackage\" from \"AccessModifiersPackage\" package, methods return next value:");
        System.out.println("       - method \"AccessModifiersClassPublicModifier\" whith access modifier \"Public\", return: " + accessModifiersClassFromPackage.AccessModifiersClassPublicModifier() + ";");
        System.out.println("      ---------------------------");
        System.out.println("       - method \"AccessModifiersClassPrivateModifier\" whith access modifier \"Private\" - not visible;");
        System.out.println("      ---------------------------");
        System.out.println("       - method \"AccessModifiersClassNoModifier\" that has no access modifier, so can't see;");

        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("After work, class \"AccessModifiersClassNoPackage\" from base package (near \"Main\"), methods return next value:");
        System.out.println("       - method \"AccessModifiersClassPublicModifier\" whith access modifier \"Public\", return: " + accessModifiersClassNoPackage.AccessModifiersClassPublicModifier() + ";");
        System.out.println("      ---------------------------");
        System.out.println("       - method \"AccessModifiersClassPrivateModifier\" whith access modifier \"Private\" - not visible;");
        System.out.println("      ---------------------------");
        System.out.println("       - method \"AccessModifiersClassNoModifier\" that has no access modifier, return: " + accessModifiersClassNoPackage.AccessModifiersClassNoModifier() + ".");
        System.out.println();
        System.out.println("       And I have access to variables:");
        System.out.println("              - variable \"byte a\", have value: " + accessModifiersClassNoPackage.a);
        System.out.println("             ---------------------------");
        System.out.println("              - variable \"byte b\", have value: " + accessModifiersClassNoPackage.b);
        System.out.println("             ---------------------------");
        System.out.println("              - variable \"byte c\", have value: " + accessModifiersClassNoPackage.c);
        System.out.println();
    }
}