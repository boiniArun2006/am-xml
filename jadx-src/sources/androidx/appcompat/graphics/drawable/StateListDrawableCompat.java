package androidx.appcompat.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class StateListDrawableCompat extends DrawableContainerCompat {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f13751N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private StateListState f13752T;

    static class StateListState extends DrawableContainerCompat.DrawableContainerState {
        int[][] nHg;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new StateListDrawableCompat(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new StateListDrawableCompat(this, resources);
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        void o() {
            int[][] iArr = this.nHg;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.nHg[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.nHg = iArr2;
        }

        int te(int[] iArr) {
            int[][] iArr2 = this.nHg;
            int iKN = KN();
            for (int i2 = 0; i2 < iKN; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        StateListState(StateListState stateListState, StateListDrawableCompat stateListDrawableCompat, Resources resources) {
            super(stateListState, stateListDrawableCompat, resources);
            if (stateListState != null) {
                this.nHg = stateListState.nHg;
            } else {
                this.nHg = new int[J2()][];
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        public void HI(int i2, int i3) {
            super.HI(i2, i3);
            int[][] iArr = new int[i3][];
            System.arraycopy(this.nHg, 0, iArr, 0, i2);
            this.nHg = iArr;
        }

        int g(int[] iArr, Drawable drawable) {
            int iN = n(drawable);
            this.nHg[iN] = iArr;
            return iN;
        }
    }

    StateListDrawableCompat(StateListState stateListState, Resources resources) {
        KN(new StateListState(stateListState, this, resources));
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public StateListState rl() {
        return new StateListState(this.f13752T, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f13751N && super.mutate() == this) {
            this.f13752T.o();
            this.f13751N = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void KN(DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.KN(drawableContainerState);
        if (drawableContainerState instanceof StateListState) {
            this.f13752T = (StateListState) drawableContainerState;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    int[] gh(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i2 = 0;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i3);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i5 = i2 + 1;
                if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i2] = attributeNameResource;
                i2 = i5;
            }
        }
        return StateSet.trimStateSet(iArr, i2);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iTe = this.f13752T.te(iArr);
        if (iTe < 0) {
            iTe = this.f13752T.te(StateSet.WILD_CARD);
        }
        if (!Uo(iTe) && !zOnStateChange) {
            return false;
        }
        return true;
    }

    StateListDrawableCompat(StateListState stateListState) {
        if (stateListState != null) {
            KN(stateListState);
        }
    }
}
