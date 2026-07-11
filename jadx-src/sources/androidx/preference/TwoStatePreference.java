package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class TwoStatePreference extends Preference {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private CharSequence f40704C;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private boolean f40705G7;
    private CharSequence Mx;
    private boolean fcU;
    protected boolean ofS;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @Override // androidx.preference.Preference
    protected Object eF(TypedArray typedArray, int i2) {
        return Boolean.valueOf(typedArray.getBoolean(i2, false));
    }

    static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.TwoStatePreference.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f40706n;

        SavedState(Parcel parcel) {
            super(parcel);
            this.f40706n = parcel.readInt() == 1;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f40706n ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    @Override // androidx.preference.Preference
    protected void B(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.B(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.B(savedState.getSuperState());
        hRu(savedState.f40706n);
    }

    @Override // androidx.preference.Preference
    protected void D(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        hRu(XQ(((Boolean) obj).booleanValue()));
    }

    public boolean EWS() {
        return this.ofS;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void How(View view) {
        boolean z2;
        int i2;
        if (!(view instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) view;
        if (this.ofS && !TextUtils.isEmpty(this.f40704C)) {
            textView.setText(this.f40704C);
        } else {
            if (this.ofS || TextUtils.isEmpty(this.Mx)) {
                z2 = true;
                if (z2) {
                    CharSequence charSequenceTe = te();
                    if (!TextUtils.isEmpty(charSequenceTe)) {
                        textView.setText(charSequenceTe);
                        z2 = false;
                    }
                }
                i2 = z2 ? 8 : 0;
                if (i2 == textView.getVisibility()) {
                    textView.setVisibility(i2);
                    return;
                }
                return;
            }
            textView.setText(this.Mx);
        }
        z2 = false;
        if (z2) {
        }
        if (z2) {
        }
        if (i2 == textView.getVisibility()) {
        }
    }

    public void K(CharSequence charSequence) {
        this.f40704C = charSequence;
        if (EWS()) {
            wTp();
        }
    }

    public void UhV(boolean z2) {
        this.fcU = z2;
    }

    public void hRu(boolean z2) {
        boolean z3 = this.ofS != z2;
        if (z3 || !this.f40705G7) {
            this.ofS = z2;
            this.f40705G7 = true;
            Nxk(z2);
            if (z3) {
                v(qm());
                wTp();
            }
        }
    }

    public void i(CharSequence charSequence) {
        this.Mx = charSequence;
        if (EWS()) {
            return;
        }
        wTp();
    }

    @Override // androidx.preference.Preference
    public boolean qm() {
        return (this.fcU ? this.ofS : !this.ofS) || super.qm();
    }

    public TwoStatePreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    protected Parcelable J() {
        Parcelable parcelableJ = super.J();
        if (N()) {
            return parcelableJ;
        }
        SavedState savedState = new SavedState(parcelableJ);
        savedState.f40706n = EWS();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected void P5() {
        super.P5();
        boolean z2 = !EWS();
        if (rl(Boolean.valueOf(z2))) {
            hRu(z2);
        }
    }

    protected void tUK(PreferenceViewHolder preferenceViewHolder) {
        How(preferenceViewHolder.nr(android.R.id.summary));
    }
}
