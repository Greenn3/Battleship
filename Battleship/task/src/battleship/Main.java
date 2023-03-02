package battleship;

import java.util.*;

public class Main {
    static List<Character> letters = new ArrayList<>(10);

    static List<List<String>> grid = new ArrayList<>();

    static {
        Collections.addAll(letters, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J');


        grid.add(new ArrayList<>(Arrays.asList(" ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")));
        grid.add(new ArrayList<>(Arrays.asList("A", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~")));
        grid.add(new ArrayList<>(Arrays.asList("B", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~")));
        grid.add(new ArrayList<>(Arrays.asList("C", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~")));
        grid.add(new ArrayList<>(Arrays.asList("D", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~")));
        grid.add(new ArrayList<>(Arrays.asList("E", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~")));
        grid.add(new ArrayList<>(Arrays.asList("F", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~")));
        grid.add(new ArrayList<>(Arrays.asList("G", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~")));
        grid.add(new ArrayList<>(Arrays.asList("H", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~")));
        grid.add(new ArrayList<>(Arrays.asList("I", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~")));
        grid.add(new ArrayList<>(Arrays.asList("J", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~")));

    }

    public static int getIndexByLetter(char letter) {
        return letters.indexOf(letter) + 1;
    }


    public static void printGrid() {
        System.out.println();
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(grid.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static boolean isFree(int letter, int number) {
        if (grid.get(letter).get(number).equals("~")) {
            if (letter == 1) {
                if (number == 1) {
                    if (grid.get(letter + 1).get(number + 1).equals("~") &&
                            grid.get(letter + 1).get(number).equals("~") &&
                            grid.get(letter).get(number + 1).equals("~")
                    ) return true;
                    else return false;

                } else if (number == 10) {
                    if (grid.get(letter + 1).get(number - 1).equals("~") &&
                            grid.get(letter + 1).get(number).equals("~") &&
                            grid.get(letter).get(number - 1).equals("~")
                    ) return true;
                    else return false;
                } else {
                    if (grid.get(letter + 1).get(number + 1).equals("~") &&
                            grid.get(letter + 1).get(number - 1).equals("~") &&
                            grid.get(letter + 1).get(number).equals("~") &&
                            grid.get(letter).get(number - 1).equals("~") &&
                            grid.get(letter).get(number + 1).equals("~")
                    ) return true;
                    else return false;
                }
            } else if (letter == 10) {
                if (number == 1) {
                    if (grid.get(letter - 1).get(number + 1).equals("~") &&
                            grid.get(letter - 1).get(number).equals("~") &&
                            grid.get(letter).get(number + 1).equals("~")
                    ) return true;
                    else return false;
                } else if (number == 10) {
                    if (grid.get(letter - 1).get(number - 1).equals("~") &&
                            grid.get(letter - 1).get(number).equals("~") &&
                            grid.get(letter).get(number - 1).equals("~")
                    ) return true;
                    else return false;
                } else {
                    if (grid.get(letter - 1).get(number + 1).equals("~") &&
                            grid.get(letter - 1).get(number - 1).equals("~") &&
                            grid.get(letter - 1).get(number).equals("~") &&
                            grid.get(letter).get(number - 1).equals("~") &&
                            grid.get(letter).get(number + 1).equals("~")
                    ) return true;
                    else return false;
                }
            } else if (number == 1) {
                if (grid.get(letter).get(number + 1).equals("~") &&
                        grid.get(letter - 1).get(number + 1).equals("~") &&
                        grid.get(letter + 1).get(number + 1).equals("~") &&
                        grid.get(letter + 1).get(number).equals("~") &&
                        grid.get(letter - 1).get(number).equals("~")
                ) return true;
                else return false;
            } else if (number == 10) {
                if (grid.get(letter).get(number - 1).equals("~") &&
                        grid.get(letter - 1).get(number - 1).equals("~") &&
                        grid.get(letter + 1).get(number - 1).equals("~") &&
                        grid.get(letter + 1).get(number).equals("~") &&
                        grid.get(letter - 1).get(number).equals("~")
                ) return true;
                else return false;
            } else {
                if (grid.get(letter - 1).get(number - 1).equals("~") &&
                        grid.get(letter - 1).get(number + 1).equals("~") &&
                        grid.get(letter - 1).get(number).equals("~") &&
                        grid.get(letter + 1).get(number - 1).equals("~") &&
                        grid.get(letter + 1).get(number + 1).equals("~") &&
                        grid.get(letter + 1).get(number).equals("~") &&
                        grid.get(letter).get(number + 1).equals("~") &&
                        grid.get(letter).get(number - 1).equals("~")
                ) return true;
                else return false;
            }
        } else return false;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

       //placing ships
        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
        placeShip(5, "Aircraft Carrier");
        printGrid();

        System.out.println("Enter the coordinates of the Battleship (4 cells):");
        placeShip(4, "Battleship");
        printGrid();

        System.out.println("Enter the coordinates of the Submarine (3 cells):");
        placeShip(3, "Submarine");
        printGrid();

        System.out.println("Enter the coordinates of the Cruiser (3 cells):");
        placeShip(3, "Cruiser");
        printGrid();

        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
        placeShip(2, "Destroyer");
        printGrid();

        //shooting
        System.out.println();


        System.out.println("The game starts!");
        System.out.println();
        printGrid();
        shoot();





    }
    public static void shoot() {
        System.out.println();
        System.out.println("Take a shot!");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print(">");
        String shootingCoords = scanner.next();
        System.out.println();
        int letter = getIndexByLetter(shootingCoords.charAt(0));
        int number = Integer.parseInt(shootingCoords.substring(1));
        if (letter > 0 && letter < 11 && number > 0 && number < 11) {
            if (grid.get(letter).get(number).equals("O")) {
                grid.get(letter).set(number, "X");
                printGrid();
                System.out.println();
                System.out.println("You hit a ship!");

            } else if (grid.get(letter).get(number).equals("~")) {
                grid.get(letter).set(number, "M");
                printGrid();
                System.out.println();
                System.out.println("You missed!");

            }
        } else {System.out.println("Error! You entered the wrong coordinates!\nTry again:");
            shoot();
        }
    }

    public static void placeShip(int size, String name) {
        int count = 0;
        boolean free = true;
        boolean wrongLocation = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("> ");
        String startCoords = scanner.next();
        String endCoords = scanner.next();
        char startLetter = startCoords.charAt(0);
        int startNumber = Integer.parseInt(startCoords.substring(1));
        char endLetter = endCoords.charAt(0);
        int endNumber = Integer.parseInt(endCoords.substring(1));

        if (startLetter == endLetter) {
            if (startNumber < endNumber) {
                for (int i = startNumber; i <= endNumber; i++) {
                    if (isFree(getIndexByLetter(startLetter), i)) {
                        count++;
                        // System.out.println("1count: " + count);
                    } else free = false;
                }
                if (count == size && free) {
                    for (int i = startNumber; i <= endNumber; i++) {
                        grid.get(getIndexByLetter(startLetter)).set(i, "0");
                    }
                }
            } else {
                for (int i = endNumber; i <= startNumber; i++) {
                    if (isFree(getIndexByLetter(startLetter), i)) {
                        count++;
                    } else free = false;
                }
                if (count == size) {
                    for (int i = endNumber; i <= startNumber; i++) {
                        grid.get(getIndexByLetter(startLetter)).set(i, "0");
                    }
                }
            }
        } else if (startNumber == endNumber) {
            if (getIndexByLetter(startLetter) < getIndexByLetter(endLetter)) {
                for (int i = getIndexByLetter(startLetter); i <= getIndexByLetter(endLetter); i++) {
                    if (isFree(i, startNumber)) {
                        count++;
                        System.out.println(count);
                    } else free = false;
                }
                if (count == size) {
                    for (int i = getIndexByLetter(startLetter); i <= getIndexByLetter(endLetter); i++) {
                        grid.get(i).set(startNumber, "0");
                    }
                }
            } else {
                for (int i = getIndexByLetter(endLetter); i <= getIndexByLetter(startLetter); i++) {
                    if (isFree(i, startNumber)) {
                        count++;
                    } else free = false;
                }
                if (count == size && free) {
                    for (int i = getIndexByLetter(endLetter); i <= getIndexByLetter(startLetter); i++) {
                        grid.get(i).set(startNumber, "0");
                    }
                }
            }
        } else {
            wrongLocation = true;
        }
        if (count == size && free) {
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 11; j++) {
                    if (grid.get(i).get(j).equals("0"))
                        grid.get(i).set(j, "O");
                }
            }
        } else {
            if (!free) {
                System.out.println("Error! You placed it too close to another one. Try again:");
                placeShip(size, name);
            } else if (wrongLocation) {
                System.out.println("Error! Wrong ship location! Try again:");
                placeShip(size, name);
            } else {
                System.out.println("Error! Wrong length of the " + name + "! Try again:");
                placeShip(size, name);
            }
        }
    }
}
