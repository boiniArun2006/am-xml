package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final Listener eWT;
    private CharSequence n1;
    private CharSequence ul;

    private class Listener implements CompoundButton.OnCheckedChangeListener {
        Listener() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            if (SwitchPreferenceCompat.this.rl(Boolean.valueOf(z2))) {
                SwitchPreferenceCompat.this.hRu(z2);
            } else {
                compoundButton.setChecked(!z2);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.eWT = new Listener();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ub, i2, i3);
        K(TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.EF, R.styleable.Qu));
        i(TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.xVH, R.styleable.HBN));
        lLA(TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.Vvq, R.styleable.X4T));
        ER(TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.uG, R.styleable.Zmq));
        UhV(TypedArrayUtils.rl(typedArrayObtainStyledAttributes, R.styleable.JVN, R.styleable.UF, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void kSg(View view) {
        boolean z2 = view instanceof SwitchCompat;
        if (z2) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.ofS);
        }
        if (z2) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.ul);
            switchCompat.setTextOff(this.n1);
            switchCompat.setOnCheckedChangeListener(this.eWT);
        }
    }

    public void ER(CharSequence charSequence) {
        this.n1 = charSequence;
        wTp();
    }

    public void lLA(CharSequence charSequence) {
        this.ul = charSequence;
        wTp();
    }

    private void W(View view) {
        if (!((AccessibilityManager) mUb().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        kSg(view.findViewById(R.id.xMQ));
        How(view.findViewById(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected void GR(View view) {
        super.GR(view);
        W(view);
    }

    @Override // androidx.preference.Preference
    public void U(PreferenceViewHolder preferenceViewHolder) {
        super.U(preferenceViewHolder);
        kSg(preferenceViewHolder.nr(R.id.xMQ));
        tUK(preferenceViewHolder);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SwitchPreferenceCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.qie);
    }
}
