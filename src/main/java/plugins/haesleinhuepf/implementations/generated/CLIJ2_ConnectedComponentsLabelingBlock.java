package plugins.haesleinhuepf.implementations.generated;
import plugins.haesleinhuepf.AbstractCLIJ2Block;
import net.haesleinhuepf.clij2.plugins.ConnectedComponentsLabeling;
// this is generated code. See src/test/java/net/haesleinhuepf/clicy/codegenerator for details
public class CLIJ2_ConnectedComponentsLabelingBlock extends AbstractCLIJ2Block {
   
    /**
     * Performs connected components analysis to a binary image and generates a label map.
     * 
     * DEPRECATED: This method is deprecated. Use ConnectedComponentsLabellingBox (or Diamond) instead.
     */
    public CLIJ2_ConnectedComponentsLabelingBlock() {
        super(new ConnectedComponentsLabeling());
    }

}
