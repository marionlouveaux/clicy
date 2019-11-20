package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJxBlock;
import net.haesleinhuepf.clij.macro.modules.DilateBox;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJx_DilateBoxBlock extends AbstractCLIJxBlock {
   
    /**
     * Computes a binary image with pixel values 0 and 1 containing the binary dilation of a given input image.
     * The dilation takes the Moore-neighborhood (8 pixels in 2D and 26 pixels in 3d) into account.
     * The pixels in the input image with pixel value not equal to 0 will be interpreted as 1.
     * 
     * This method is comparable to the 'Dilate' menu in ImageJ in case it is applied to a 2D image. The only
     * difference is that the output image contains values 0 and 1 instead of 0 and 255.
     */
    public CLIJx_DilateBoxBlock() {
        super(new DilateBox());
    }

}
