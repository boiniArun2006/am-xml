package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int f40695C;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private int f40696G7;
    private boolean Jk;
    private int Mx;
    boolean Rl;
    SeekBar eWT;
    boolean fcU;
    private final View.OnKeyListener mYa;
    boolean n1;
    int ofS;
    private final SeekBar.OnSeekBarChangeListener qm;
    private TextView ul;

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.qm = new SeekBar.OnSeekBarChangeListener() { // from class: androidx.preference.SeekBarPreference.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i5, boolean z2) {
                if (z2) {
                    SeekBarPreference seekBarPreference = SeekBarPreference.this;
                    if (seekBarPreference.Rl || !seekBarPreference.fcU) {
                        seekBarPreference.K(seekBar);
                        return;
                    }
                }
                SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
                seekBarPreference2.How(i5 + seekBarPreference2.f40695C);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                SeekBarPreference.this.fcU = true;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                SeekBarPreference.this.fcU = false;
                int progress = seekBar.getProgress();
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (progress + seekBarPreference.f40695C != seekBarPreference.ofS) {
                    seekBarPreference.K(seekBar);
                }
            }
        };
        this.mYa = new View.OnKeyListener() { // from class: androidx.preference.SeekBarPreference.2
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i5, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if ((!seekBarPreference.n1 && (i5 == 21 || i5 == 22)) || i5 == 23 || i5 == 66) {
                    return false;
                }
                SeekBar seekBar = seekBarPreference.eWT;
                if (seekBar == null) {
                    Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                    return false;
                }
                return seekBar.onKeyDown(i5, keyEvent);
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.How, i2, i3);
        this.f40695C = typedArrayObtainStyledAttributes.getInt(R.styleable.lLA, 0);
        EWS(typedArrayObtainStyledAttributes.getInt(R.styleable.tUK, 100));
        hRu(typedArrayObtainStyledAttributes.getInt(R.styleable.kSg, 0));
        this.n1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ER, true);
        this.Jk = typedArrayObtainStyledAttributes.getBoolean(R.styleable.f40678W, false);
        this.Rl = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RQ, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void UhV(int i2) {
        i(i2, true);
    }

    @Override // androidx.preference.Preference
    protected Object eF(TypedArray typedArray, int i2) {
        return Integer.valueOf(typedArray.getInt(i2, 0));
    }

    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.SeekBarPreference.SavedState.1
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

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f40699O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f40700n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f40701t;

        SavedState(Parcel parcel) {
            super(parcel);
            this.f40700n = parcel.readInt();
            this.f40701t = parcel.readInt();
            this.f40699O = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f40700n);
            parcel.writeInt(this.f40701t);
            parcel.writeInt(this.f40699O);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private void i(int i2, boolean z2) {
        int i3 = this.f40695C;
        if (i2 < i3) {
            i2 = i3;
        }
        int i5 = this.Mx;
        if (i2 > i5) {
            i2 = i5;
        }
        if (i2 != this.ofS) {
            this.ofS = i2;
            How(i2);
            Y(i2);
            if (z2) {
                wTp();
            }
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
        this.ofS = savedState.f40700n;
        this.f40695C = savedState.f40701t;
        this.Mx = savedState.f40699O;
        wTp();
    }

    @Override // androidx.preference.Preference
    protected void D(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        UhV(S(((Integer) obj).intValue()));
    }

    public final void EWS(int i2) {
        int i3 = this.f40695C;
        if (i2 < i3) {
            i2 = i3;
        }
        if (i2 != this.Mx) {
            this.Mx = i2;
            wTp();
        }
    }

    void How(int i2) {
        TextView textView = this.ul;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
    }

    void K(SeekBar seekBar) {
        int progress = this.f40695C + seekBar.getProgress();
        if (progress != this.ofS) {
            if (rl(Integer.valueOf(progress))) {
                i(progress, false);
            } else {
                seekBar.setProgress(this.ofS - this.f40695C);
                How(this.ofS);
            }
        }
    }

    public final void hRu(int i2) {
        if (i2 != this.f40696G7) {
            this.f40696G7 = Math.min(this.Mx - this.f40695C, Math.abs(i2));
            wTp();
        }
    }

    @Override // androidx.preference.Preference
    protected Parcelable J() {
        Parcelable parcelableJ = super.J();
        if (N()) {
            return parcelableJ;
        }
        SavedState savedState = new SavedState(parcelableJ);
        savedState.f40700n = this.ofS;
        savedState.f40701t = this.f40695C;
        savedState.f40699O = this.Mx;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void U(PreferenceViewHolder preferenceViewHolder) {
        super.U(preferenceViewHolder);
        preferenceViewHolder.itemView.setOnKeyListener(this.mYa);
        this.eWT = (SeekBar) preferenceViewHolder.nr(R.id.J2);
        TextView textView = (TextView) preferenceViewHolder.nr(R.id.Uo);
        this.ul = textView;
        if (this.Jk) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.ul = null;
        }
        SeekBar seekBar = this.eWT;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.qm);
        this.eWT.setMax(this.Mx - this.f40695C);
        int i2 = this.f40696G7;
        if (i2 != 0) {
            this.eWT.setKeyProgressIncrement(i2);
        } else {
            this.f40696G7 = this.eWT.getKeyProgressIncrement();
        }
        this.eWT.setProgress(this.ofS - this.f40695C);
        How(this.ofS);
        this.eWT.setEnabled(T());
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SeekBarPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.gh);
    }
}
