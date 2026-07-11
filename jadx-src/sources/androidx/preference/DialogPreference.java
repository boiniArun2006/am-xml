package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private CharSequence f40515C;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private CharSequence f40516G7;
    private Drawable Mx;
    private int eWT;
    private CharSequence fcU;
    private CharSequence ofS;

    public interface TargetFragment {
        Preference KN(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.mUb, i2, i3);
        String strAz = TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.f40681Z, R.styleable.gh);
        this.ofS = strAz;
        if (strAz == null) {
            this.ofS = fD();
        }
        this.f40515C = TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.f40690o, R.styleable.qie);
        this.Mx = TypedArrayUtils.t(typedArrayObtainStyledAttributes, R.styleable.Ik, R.styleable.az);
        this.f40516G7 = TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.f40675S, R.styleable.ty);
        this.fcU = TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.XQ, R.styleable.HI);
        this.eWT = TypedArrayUtils.qie(typedArrayObtainStyledAttributes, R.styleable.f40691r, R.styleable.ck, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public Drawable EWS() {
        return this.Mx;
    }

    public CharSequence How() {
        return this.f40516G7;
    }

    public CharSequence K() {
        return this.fcU;
    }

    public CharSequence UhV() {
        return this.f40515C;
    }

    public int hRu() {
        return this.eWT;
    }

    public CharSequence i() {
        return this.ofS;
    }

    @Override // androidx.preference.Preference
    protected void P5() {
        nY().o(this);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.n(context, R.attr.rl, android.R.attr.dialogPreferenceStyle));
    }
}
