class BatteryStatus {

    enum BatteryLevel {

        FULL(75, 100),
        MEDIUM(40, 74),
        LOW(15, 39),
        CRITICAL(0, 14);

        int minPercentage, maxPercentage;

        BatteryLevel(int min, int max) {
            minPercentage = min;
            maxPercentage = max;
        }

        public int getMinPercentage() {
            return this.minPercentage;
        }

        public int getMaxPercentage() {
            return this.maxPercentage;
        }

        public String getWarning() {
            String msg = switch (this) {
                case FULL -> "✅ Battery is full. Good to go!";
                case MEDIUM -> "🔵 Battery OK. Consider charging soon.";
                case LOW -> "⚠️  Low battery! Please charge now.";
                case CRITICAL -> "🔴 CRITICAL! Plug in immediately!";
                default -> "Wrong Input";
            };

            return msg;
        }

        static BatteryLevel fromPercentage(int percent) {
            
            if (percent < 0 || percent > 100) {
                throw new IllegalArgumentException(
                        "❌ Invalid: " + percent + "%. Must be 0–100!");
            }
            
            for(BatteryLevel level : BatteryLevel.values()){
                if(percent >= level.minPercentage && percent <= level.maxPercentage){
                    return level;
                }
            }
            throw new IllegalArgumentException(
            "No level found for: " + percent
        );
        }
    }

    public static void main(String []args){
        BatteryLevel level = BatteryLevel.fromPercentage(20);
        System.out.println(level);
        System.out.println(level.getWarning());
    }
}