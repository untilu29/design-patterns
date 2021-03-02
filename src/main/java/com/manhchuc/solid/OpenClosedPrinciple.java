package com.manhchuc.solid;

public class OpenClosedPrinciple {
    /**
     * Software entities ... should be open for extension, but closed for modification.
     */
    class GarminForRunner {
        private String heartRateTracking;
        private String watchTime;
    }

    class GarminForRunnerWithMusic extends GarminForRunner {
        private String playMusic;
    }
}
