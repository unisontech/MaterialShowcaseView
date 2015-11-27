package uk.co.deanwild.materialshowcaseview.shape;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import uk.co.deanwild.materialshowcaseview.target.Target;

public class BitmapShape implements Shape {

    private final Bitmap bitmap;
    private final Rect bounds;

    public BitmapShape(Bitmap bitmap) {
        this(bitmap, null);
    }

    public BitmapShape(Bitmap bitmap, Rect bounds) {
        this.bitmap = bitmap;
        this.bounds = bounds;
    }

    @Override
    public void draw(Canvas canvas, Paint paint, int x, int y, int padding) {
        if (bounds == null) {
            canvas.drawBitmap(bitmap, x, y, null);
        } else {
            Rect dst = new Rect(
                    bounds.left + x,
                    bounds.top + y,
                    bounds.right + x,
                    bounds.bottom + y
            );
            canvas.drawBitmap(bitmap, null, dst, null);
        }
    }

    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }

    @Override
    public void updateTarget(Target target) {

    }
}
