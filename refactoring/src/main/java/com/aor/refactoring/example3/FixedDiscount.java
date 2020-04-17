package com.aor.refactoring.example3;

public class FixedDiscount implements Discount {

        private int fixed;

        public FixedDiscount(int fixed) {
            this.fixed = fixed;
        }

        @Override
        public double applyDiscount(double price) {
            double discountedPrice = price;

            if (fixed > 0) discountedPrice = fixed > price ? 0 : price - fixed;
            else discountedPrice = price;

            return discountedPrice;
        }
}
