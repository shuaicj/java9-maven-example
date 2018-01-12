#!/bin/bash

java -p java9-example-module-main/target/classes:java9-example-module-multiplier/target/classes:java9-example-module-adder/target/classes -m shuaicj.example.java9.module.main/shuaicj.example.java9.module.main.App 2 3 5 6
