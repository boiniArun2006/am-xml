package G7;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SimpleArrayMap f3383n = new SimpleArrayMap();
    private final SimpleArrayMap rl = new SimpleArrayMap();

    public static Ml t(Context context, int i2) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return nr(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return nr(arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i2), e2);
            return null;
        }
    }

    private static void n(Ml ml, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            ml.O(objectAnimator.getPropertyName(), objectAnimator.getValues());
            ml.J2(objectAnimator.getPropertyName(), I28.n(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    private static Ml nr(List list) {
        Ml ml = new Ml();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            n(ml, (Animator) list.get(i2));
        }
        return ml;
    }

    public void J2(String str, I28 i28) {
        this.f3383n.put(str, i28);
    }

    public void O(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.rl.put(str, propertyValuesHolderArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Ml) {
            return this.f3383n.equals(((Ml) obj).f3383n);
        }
        return false;
    }

    public int hashCode() {
        return this.f3383n.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3383n + "}\n";
    }

    public static Ml rl(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0) {
            return t(context, resourceId);
        }
        return null;
    }
}
