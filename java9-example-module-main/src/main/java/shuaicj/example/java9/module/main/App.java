package shuaicj.example.java9.module.main;

import java.util.Arrays;

import shuaicj.example.java9.module.multiplier.Multiplier;

/**
 * App entry.
 *
 * @author shuaicj 2018/01/12
 */
public class App {

    public static void main(String[] args) {
        if (args.length < 2) {
            throw new IllegalArgumentException("need more args");
        }

        StringBuilder builder = new StringBuilder();
        Multiplier multiplier = Multiplier.of();

        Arrays.stream(args)
              .forEach(arg -> {
                  if (builder.length() > 0) {
                      builder.append(" * ");
                  }
                  builder.append(arg);
                  multiplier.multiply(Integer.parseInt(arg));
              });

        builder.append(" = ");
        builder.append(multiplier.result());

        System.out.println(builder.toString());
    }
}
