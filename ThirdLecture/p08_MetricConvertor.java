import java.util.Scanner;

public class p08_MetricConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        String metric = scanner.nextLine();
        String metric1 = scanner.nextLine();

        if (metric.equals("mm")) {
            if (metric1.equals("cm")) {
                System.out.printf("%.7f cm", (num1 = (num1 / 1000) * 100));
            } else if (metric1.equals("mi")) {
                System.out.printf("%.7f mi", (num1 / 1000) * 0.000621371192);
            } else if (metric1.equals("m")) {
                System.out.printf("%.7f m", (num1 / 1000));
            } else if (metric1.equals("in")) {
                System.out.printf("%.7f in", (num1 = (num1 / 1000) * 39.3700787));
            } else if (metric1.equals("km")) {
                System.out.printf("%.7f km", (num1 = (num1 / 1000) * 0.001));
            } else if (metric1.equals("ft")) {
                System.out.printf("%.7f ft", (num1 = (num1 / 1000) * 3.2808399));
            } else if (metric1.equals("yd")) {
                System.out.printf("%.7f yd", (num1 = (num1 / 1000) * 1.0936133));
            } else if (metric1.equals("mm")) {
                System.out.printf("%.7f mm", num1);
            }
        } else if (metric.equals("cm")) {
            if (metric1.equals("mm")) {
                System.out.printf("%.7f mm", (num1 = (num1 / 100) * 1000));
            } else if (metric1.equals("m")) {
                System.out.printf("%.7f m", (num1 / 100));
            } else if (metric1.equals("mi")) {
                System.out.printf("%.7f mi", (num1 = (num1 / 100) * 0.000621371192));
            } else if (metric1.equals("in")) {
                System.out.printf("%.7f in", (num1 = (num1 / 100) * 39.3700787));
            } else if (metric1.equals("km")) {
                System.out.printf("%.7f km", (num1 = (num1 / 100) * 0.001));
            } else if (metric1.equals("ft")) {
                System.out.printf("%.7f ft", (num1 = (num1 / 100) * 3.2808399));
            } else if (metric1.equals("yd")) {
                System.out.printf("%.7f yd", (num1 = (num1 / 100) * 1.0936133));
            } else if (metric1.equals("cm")) {
                System.out.printf("%.7f cm", num1);
            }
        } else if (metric.equals("mi")) {
            if (metric1.equals("mm")) {
                System.out.printf("%.7f mm", (num1 = (num1 / 0.000621371192) * 1000));
            } else if (metric1.equals("m")) {
                System.out.printf("%.7f m", (num1 / 0.000621371192));
            } else if (metric1.equals("cm")) {
                System.out.printf("%.7f cm", (num1 = (num1 / 0.000621371192) * 100));
            } else if (metric1.equals("in")) {
                System.out.printf("%.7f in", (num1 = (num1 / 0.000621371192) * 39.3700787));
            } else if (metric1.equals("km")) {
                System.out.printf("%.7f km", (num1 = (num1 / 0.000621371192) * 0.001));
            } else if (metric1.equals("ft")) {
                System.out.printf("%.7f ft", (num1 = (num1 / 0.000621371192) * 3.2808399));
            } else if (metric1.equals("yd")) {
                System.out.printf("%.7f yd", (num1 = (num1 / 0.000621371192) * 1.0936133));
            } else if (metric1.equals("mi")) {
                System.out.printf("%.7f mi", num1);
            }

        } else if (metric.equals("in")) {
            if (metric1.equals("mm")) {
                System.out.printf("%.7f mm", (num1 = (num1 / 39.3700787) * 1000));
            } else if (metric1.equals("m")) {
                System.out.printf("%.7f m", (num1 / 39.3700787));
            } else if (metric1.equals("cm")) {
                System.out.printf("%.7f cm", (num1 = (num1 / 39.3700787) * 100));
            } else if (metric1.equals("mi")) {
                System.out.printf("%.7f mi", (num1 = (num1 / 39.3700787) * 0.000621371192));
            } else if (metric1.equals("km")) {
                System.out.printf("%.7f km", (num1 = (num1 / 39.3700787) * 0.001));
            } else if (metric1.equals("ft")) {
                System.out.printf("%.7f ft", (num1 = (num1 / 39.3700787) * 3.2808399));
            } else if (metric1.equals("yd")) {
                System.out.printf("%.7f yd", (num1 = (num1 / 39.3700787) * 1.0936133));
            } else if (metric1.equals("in")) {
                System.out.printf("%.7f in", num1);
            }
        } else if (metric.equals("km")) {
            if (metric1.equals("mm")) {
                System.out.printf("%.7f mm", (num1 = (num1 / 0.001) * 1000));
            } else if (metric1.equals("m")) {
                System.out.printf("%.7f m", (num1 / 0.001));
            } else if (metric1.equals("cm")) {
                System.out.printf("%.7f cm", (num1 = (num1 / 0.001) * 100));
            } else if (metric1.equals("mi")) {
                System.out.printf("%.7f mi", (num1 = (num1 / 0.001) * 0.000621371192));
            } else if (metric1.equals("in")) {
                System.out.printf("%.7f in", (num1 = (num1 / 0.001) * 39.3700787));
            } else if (metric1.equals("ft")) {
                System.out.printf("%.7f ft", (num1 = (num1 / 0.001) * 3.2808399));
            } else if (metric1.equals("yd")) {
                System.out.printf("%.7f yd", (num1 = (num1 / 0.001) * 1.0936133));
            } else if (metric1.equals("km")) {
                System.out.printf("%.7f km", num1);
            }
        } else if (metric.equals("ft")) {
            if (metric1.equals("mm")) {
                System.out.printf("%.7f mm", (num1 = (num1 / 3.2808399) * 1000));
            } else if (metric1.equals("m")) {
                System.out.printf("%.7f m", (num1 / 3.2808399));
            } else if (metric1.equals("cm")) {
                System.out.printf("%.7f cm", (num1 = (num1 / 3.2808399) * 100));
            } else if (metric1.equals("mi")) {
                System.out.printf("%.7f mi", (num1 = (num1 / 3.2808399) * 0.000621371192));
            } else if (metric1.equals("in")) {
                System.out.printf("%.7f in", (num1 = (num1 / 3.2808399) * 39.3700787));
            } else if (metric1.equals("km")) {
                System.out.printf("%.7f km", (num1 = (num1 / 3.2808399) * 0.001));
            } else if (metric1.equals("yd")) {
                System.out.printf("%.7f yd", (num1 = (num1 / 3.2808399) * 1.0936133));
            } else if (metric1.equals("ft")) {
                System.out.printf("%.7f ft", num1);
            }
        } else if (metric.equals("yd")) {
            if (metric1.equals("mm")) {
                System.out.printf("%.7f mm", (num1 = (num1 / 1.0936133) * 1000));
            } else if (metric1.equals("m")) {
                System.out.printf("%.7f m", (num1 / 1.0936133));
            } else if (metric1.equals("cm")) {
                System.out.printf("%.7f cm", (num1 = (num1 / 1.0936133) * 100));
            } else if (metric1.equals("mi")) {
                System.out.printf("%.7f mi", (num1 = (num1 / 1.0936133) * 0.000621371192));
            } else if (metric1.equals("in")) {
                System.out.printf("%.7f in", (num1 = (num1 / 1.0936133) * 39.3700787));
            } else if (metric1.equals("km")) {
                System.out.printf("%.7f km", (num1 = (num1 / 1.0936133) * 0.001));
            } else if (metric1.equals("ft")) {
                System.out.printf("%.7f ft", (num1 = (num1 / 1.0936133) * 3.2808399));
            } else if (metric1.equals("yd")) {
                System.out.printf("%.7f yd", num1);
            }
        } else if (metric.equals("m")) {
            if (metric1.equals("mm")) {
                System.out.printf("%.7f mm", (num1 * 1000));
            } else if (metric1.equals("cm")) {
                System.out.printf("%.7f cm", (num1 * 100));
            } else if (metric1.equals("mi")) {
                System.out.printf("%.7f mi", (num1 * 0.000621371192));
            } else if (metric1.equals("in")) {
                System.out.printf("%.7f in", (num1 * 39.3700787));
            } else if (metric1.equals("km")) {
                System.out.printf("%.7f km", (num1 * 0.001));
            } else if (metric1.equals("ft")) {
                System.out.printf("%.7f ft", (num1 * 3.2808399));
            } else if (metric1.equals("yd")) {
                System.out.printf("%.7f yd", (num1 * 1.0936133));
            } else if (metric1.equals("m")) {
                System.out.printf("%.7f m", num1);
            }
        }
    }
}
