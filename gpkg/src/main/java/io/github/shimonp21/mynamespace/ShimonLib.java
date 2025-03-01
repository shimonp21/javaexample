/*
 * This source file was generated by the Gradle 'init' task
 */
package io.github.shimonp21.mynamespace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShimonLib {
    public int myAdd(int x, int y) {
        Logger logger = LoggerFactory.getLogger(ShimonLib.class);

        logger.info("hello, logback");
        logger.warn("hello, warning");
        logger.error("hello, error");

        return x + y;
    }

    public int myMul(int x, int y) {
        return x * y;
    }

    public int mySub(int x, int y) {
        return x - y;
    }
}
