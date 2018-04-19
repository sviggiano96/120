/**
 * Animator class - a class that can animate a canvas.
 * This is done by periodically calling the moveShapes method below
 * to adjust the canvas for the next frame of the output.
 * The moveShapes class returns true to continue the animation, or false
 * to stop the animation.
 */
 public interface Animator {
 
   /**
    * moveShapes - set up the next frame of an animation.
    * @return true to continue the animation, or false to stop it
    */
   public boolean moveShapes();
}