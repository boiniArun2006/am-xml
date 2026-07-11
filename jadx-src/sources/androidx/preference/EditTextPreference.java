package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.Preference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class EditTextPreference extends DialogPreference {
    private OnBindEditTextListener n1;
    private String ul;

    public interface OnBindEditTextListener {
        void n(EditText editText);
    }

    public static final class SimpleSummaryProvider implements Preference.SummaryProvider<EditTextPreference> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static SimpleSummaryProvider f40519n;

        public static SimpleSummaryProvider rl() {
            if (f40519n == null) {
                f40519n = new SimpleSummaryProvider();
            }
            return f40519n;
        }

        private SimpleSummaryProvider() {
        }

        @Override // androidx.preference.Preference.SummaryProvider
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public CharSequence n(EditTextPreference editTextPreference) {
            if (TextUtils.isEmpty(editTextPreference.ER())) {
                return editTextPreference.mUb().getString(R.string.f40659t);
            }
            return editTextPreference.ER();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.WPU, i2, i3);
        int i5 = R.styleable.aYN;
        if (TypedArrayUtils.rl(typedArrayObtainStyledAttributes, i5, i5, false)) {
            n1(SimpleSummaryProvider.rl());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.EditTextPreference.SavedState.1
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
        String f40518n;

        SavedState(Parcel parcel) {
            super(parcel);
            this.f40518n = parcel.readString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f40518n);
        }
    }

    @Override // androidx.preference.Preference
    protected void B(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.B(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.B(savedState.getSuperState());
        lLA(savedState.f40518n);
    }

    @Override // androidx.preference.Preference
    protected void D(Object obj) {
        lLA(WPU((String) obj));
    }

    public String ER() {
        return this.ul;
    }

    @Override // androidx.preference.Preference
    public boolean qm() {
        return TextUtils.isEmpty(this.ul) || super.qm();
    }

    OnBindEditTextListener tUK() {
        return this.n1;
    }

    @Override // androidx.preference.Preference
    protected Parcelable J() {
        Parcelable parcelableJ = super.J();
        if (N()) {
            return parcelableJ;
        }
        SavedState savedState = new SavedState(parcelableJ);
        savedState.f40518n = ER();
        return savedState;
    }

    @Override // androidx.preference.Preference
    protected Object eF(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    public void lLA(String str) {
        boolean zQm = qm();
        this.ul = str;
        k(str);
        boolean zQm2 = qm();
        if (zQm2 != zQm) {
            v(zQm2);
        }
        wTp();
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.n(context, R.attr.nr, android.R.attr.editTextPreferenceStyle));
    }
}
