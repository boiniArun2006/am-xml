package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class SwitchPreference extends TwoStatePreference {
    private final Listener eWT;
    private CharSequence n1;
    private CharSequence ul;

    private class Listener implements CompoundButton.OnCheckedChangeListener {
        Listener() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            if (SwitchPreference.this.rl(Boolean.valueOf(z2))) {
                SwitchPreference.this.hRu(z2);
            } else {
                compoundButton.setChecked(!z2);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.eWT = new Listener();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.a63, i2, i3);
        K(TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.p0N, R.styleable.f40665F));
        i(TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.Bu, R.styleable.QZ6));
        lLA(TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.f40684f, R.styleable.VwL));
        ER(TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.Uf, R.styleable.mI));
        UhV(TypedArrayUtils.rl(typedArrayObtainStyledAttributes, R.styleable.T3L, R.styleable.tFV, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void kSg(View view) {
        boolean z2 = view instanceof Switch;
        if (z2) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.ofS);
        }
        if (z2) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.ul);
            r42.setTextOff(this.n1);
            r42.setOnCheckedChangeListener(this.eWT);
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
        kSg(view.findViewById(android.R.id.switch_widget));
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
        kSg(preferenceViewHolder.nr(android.R.id.switch_widget));
        tUK(preferenceViewHolder);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public SwitchPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.n(context, R.attr.az, android.R.attr.switchPreferenceStyle));
    }
}
