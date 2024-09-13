public class LoopinStrings {
    public static void main(String[] args) {
    
        //.1: https://stackoverflow.com/questions/196830/what-is-the-easiest-best-most-correct-way-to-iterate-through-the-characters-of-a
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Curabitur pretium tincidunt lacus. Nulla gravida orci a odio. Nullam varius, turpis et commodo pharetra, est eros bibendum elit, nec luctus magna felis sollicitudin ipsum. Vestibulum purus quam, scelerisque ut, mollis sed, nonummy id, metus. Ut ullamcorper, ligula eu tempor congue, eros lectus tristique turpis, vitae tristique eros nisi ac odio. Nam sed justo id felis consectetur facilisis at id libero. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Donec vehicula risus sit amet quam fermentum suscipit. Suspendisse potenti. Phasellus et massa id velit laoreet suscipit in id ligula. Nulla facilisi. Sed vitae mi vestibulum, sollicitudin metus sed, luctus libero. Mauris in fringilla nunc. Proin malesuada, magna nec tristique tincidunt, sapien ligula aliquet erat, ut vulputate sapien risus et mauris. Nam vulputate mauris eget urna lacinia, a feugiat dui suscipit. Quisque malesuada lacus nec nisi vehicula, sed varius sapien aliquet. Aenean fermentum, dolor nec scelerisque ullamcorper, ipsum ligula viverra lorem, eu viverra dolor mauris at magna. In fermentum felis ac nisl interdum, sit amet blandit elit tempor. Donec in massa est. Morbi a sapien nec mi tincidunt dictum non eget nisi. Aliquam erat volutpat. Nulla facilisi. Cras suscipit, erat sit amet efficitur varius, odio sapien viverra nulla, id dictum orci metus sit amet felis. Fusce volutpat vestibulum lectus nec faucibus. Donec ut urna justo. Donec non sollicitudin elit. Aliquam erat volutpat. Suspendisse potenti. Quisque ac tortor id ante consectetur convallis. Nunc fringilla dui ut ipsum gravida, non posuere tortor pharetra. Nulla facilisi. Sed vehicula justo ut tortor feugiat, eget ullamcorper elit ultricies. Sed interdum eros ac augue pretium malesuada. Ut feugiat, nunc non efficitur dapibus, turpis libero faucibus nunc, et aliquet magna lacus eget orci. Nam quis feugiat urna, at commodo nulla. Aenean at scelerisque magna. In vehicula, sem a aliquet tincidunt, sapien quam euismod sapien, sit amet iaculis mi risus eu odio. Aliquam erat volutpat. Sed nec erat nec odio vehicula vehicula non non nisl. Phasellus ut sem a velit cursus gravida a et nunc. In consectetur facilisis augue, sed convallis lorem vehicula ac. Vivamus feugiat libero ac risus pretium, at pellentesque lacus cursus. Vestibulum nec augue vel lectus vestibulum tincidunt. Etiam suscipit felis id lacus ornare, ut viverra mauris cursus. Sed at pharetra sapien. Aliquam erat volutpat. Duis suscipit sollicitudin elit, ut fringilla urna sodales eu. Aenean varius erat eu neque luctus, eu posuere mi varius. Quisque ac bibendum libero. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae. Praesent sagittis velit id nulla ornare, a efficitur dolor malesuada. Suspendisse potenti. Fusce condimentum ligula at ex facilisis, nec iaculis sem volutpat. Donec consequat, dolor a volutpat posuere, urna elit dictum libero, a cursus nisl orci nec dolor. Sed suscipit neque id pharetra dictum. In at augue ut mauris laoreet pellentesque. Sed sit amet quam ut libero fermentum pharetra nec ac libero. Proin efficitur, nulla a consequat vulputate, mauris sem venenatis est, ac fermentum magna lectus et sapien. Phasellus posuere ipsum quis velit hendrerit, eget posuere erat commodo. Integer sit amet risus in ante venenatis pretium ut et risus. Nulla facilisi. Quisque et ligula at nulla tempus convallis. Mauris condimentum, odio ac ullamcorper posuere, elit eros varius nulla, et sagittis lorem turpis eu orci. Curabitur et augue vel lectus feugiat posuere. Duis interdum felis a nisl accumsan sollicitudin. Aenean sed erat euismod, volutpat orci et, interdum nisl. Ut at libero eu elit gravida fermentum. Phasellus sit amet libero a odio dignissim aliquet. Duis et est euismod, faucibus dui eget, egestas mauris. Nam ac ex nec elit elementum fermentum vel sit amet nulla. Aenean sit amet est sed elit ultricies varius. Nulla facilisi. Pellentesque convallis orci vitae arcu suscipit, sit amet pharetra dolor sollicitudin. Aliquam erat volutpat. Mauris nec dui nec ligula vulputate fermentum. Duis eget velit sit amet justo varius dignissim. Vestibulum sit amet tincidunt lorem. Proin eget purus ac libero malesuada laoreet. Donec vestibulum, mauris at ultricies ultrices, justo arcu fermentum ex, a rutrum libero nisi nec nunc. Donec nec lorem purus.";
        // ctc
        char charToCount = 'a';
        //call
        int count = countCharOccurrences(text, charToCount);
        // output
        System.out.println("the character '" + charToCount + "' appears " + count + " times");

        // 1.1;
        final char c = 'g';
		final String s = "giggling";
		int counted = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				++counted;
		}
		System.out.println(counted);

        //2
        String str= "hi hello bonjour konichiwa namaste";
        
    
    }

    // Method to count occurrences of a character in a string
    public static int countCharOccurrences(String text, char charToCount) {
        int count = 0;
        // Convert string to char array
        char[] charArray = text.toCharArray();
        
        // Iterate through each character in the array
        for (char c : charArray) {
            // Increment count if character matches
            if (c == charToCount) {
                count++;
            }
        }
        return count;
    }

        public static int replacer(String text, char charToCount) {
            int count = 0;
            // Convert string to char array
            char[] charArray = text.toCharArray();
            
            // Iterate through each character in the array
            for (char c : charArray) {
                // Increment count if character matches
                if (c == charToCount) {
                    count++;
                }
            }
            return count;
    
    }

}
