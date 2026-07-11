package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.TypeEvaluator;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PathParser;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class AnimatorInflaterCompat {

    private static class PathDataEvaluator implements TypeEvaluator<PathParser.PathDataNode[]> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private PathParser.PathDataNode[] f42312n;

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public PathParser.PathDataNode[] evaluate(float f3, PathParser.PathDataNode[] pathDataNodeArr, PathParser.PathDataNode[] pathDataNodeArr2) {
            if (PathParser.rl(pathDataNodeArr, pathDataNodeArr2)) {
                if (!PathParser.rl(this.f42312n, pathDataNodeArr)) {
                    this.f42312n = PathParser.J2(pathDataNodeArr);
                }
                for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
                    this.f42312n[i2].KN(pathDataNodeArr[i2], pathDataNodeArr2[i2], f3);
                }
                return this.f42312n;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    public static Animator n(Context context, int i2) {
        return AnimatorInflater.loadAnimator(context, i2);
    }
}
