/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.atti.main;

import java.util.Random;
import java.util.logging.Logger;
import javax.inject.Inject;

/**
 *
 * @author eandgya
 */
@EightDigits
public class IssnGenerator {
    @Inject
    private Logger logger;
    @Loggable
    public String generateNumber() {
        String issn = "8-" + Math.abs(new Random().nextInt());
        logger.info("Згенеровано ISBN : " + issn);
        return issn;
    }
}
