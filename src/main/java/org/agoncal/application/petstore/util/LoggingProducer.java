package org.agoncal.application.petstore.util;

import java.util.logging.Logger;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */

public class LoggingProducer {

    // ======================================
    // =          Business methods          =
    // ======================================

    @Produces
    public Logger produceLogger() {
        return Logger.getGlobal();
    }
}
