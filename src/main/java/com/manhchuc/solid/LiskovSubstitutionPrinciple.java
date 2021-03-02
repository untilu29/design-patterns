package com.manhchuc.solid;

import lombok.Data;

public class LiskovSubstitutionPrinciple {
    /**
     * Objects in a program should be replaceable with instances of their subtypes
     * without altering the correctness of that program.
     */
    @Data
    class TransportationDevice {
        private Integer name;
        private Integer speed;
    }

    class TransportationWithoutEngines extends TransportationDevice {
         void startMoving() {
        }
    }

    class TransportationWithEngines extends TransportationDevice {
         void startEngines() {
        }
    }

    class Car extends TransportationWithEngines {
        @Override
        void startEngines() {
            super.startEngines();
        }
    }

    class Bicycle extends TransportationWithoutEngines {
        @Override
        void startMoving() {
            super.startMoving();
        }
    }
}
