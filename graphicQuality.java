import java.util.*;

class graphicQuality{
    public static void main(String[] args) {
        //Declaring variable
        Scanner sc = new Scanner(System.in);
        int gCard, processor, numCore, mResolution;

        //Asking for input
        System.out.print("Please enter the clock speed (in Megahertz) of your graphics card:");
        gCard = sc.nextInt();

        System.out.print("Please enter the clock speed (in Megahertz) of your processor:");
        processor = sc.nextInt();

        System.out.print("Please enter the number of cores of your processor:");
        numCore = sc.nextInt();

        System.out.print("What is the resolution of your monitor? \n\t1. 1280 x 720 \n\t2. 1920 x 1080 \n\t3. 2560 x 1440 \n\t4. 3840 x 2160\nPlease select from the options above:");
        mResolution = sc.nextInt();

        //Result
        int computerScore = (int)(((5 * gCard) + (numCore * processor)) * ((mResolution < 3  ? (mResolution%2==1 ? 1:.75) : (mResolution%2==11 ? .55:.35))));
        System.out.printf("\nComputer Hardware Graphics Quality Recommendation Tool \n\nGPU Clock Speed: %d MHz\nCPU Clock Speed: %d MHz\nNumber of cores: %s \nMonitor Resolution: %s \nPerformance Score: %s \nRecommended Graphics Quality: %s", gCard, processor, numCore, (mResolution < 3  ? (mResolution%2==1 ? "1280 x 720":"1920 x 1080") : (mResolution%2==1 ? "2560 x 1440": "3840 x 21601")), computerScore, (computerScore > 15000 ? (computerScore >= 17000 ? "Ultra" : " High"): (computerScore <= 11000 ? "Unable to Play" : ((computerScore <= 13000) ? "Low": "Medium"))));
        

    }
}


