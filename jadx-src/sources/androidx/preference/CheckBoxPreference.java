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
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final Listener eWT;

    private class Listener implements CompoundButton.OnCheckedChangeListener {
        Listener() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
            if (CheckBoxPreference.this.rl(Boolean.valueOf(z2))) {
                CheckBoxPreference.this.hRu(z2);
            } else {
                compoundButton.setChecked(!z2);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.eWT = new Listener();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f40692t, i2, i3);
        K(TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.xMQ, R.styleable.nr));
        i(TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.KN, R.styleable.f40674O));
        UhV(TypedArrayUtils.rl(typedArrayObtainStyledAttributes, R.styleable.Uo, R.styleable.J2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ER(View view) {
        boolean z2 = view instanceof CompoundButton;
        if (z2) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.ofS);
        }
        if (z2) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.eWT);
        }
    }

    private void lLA(View view) {
        if (!((AccessibilityManager) mUb().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        ER(view.findViewById(android.R.id.checkbox));
        How(view.findViewById(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected void GR(View view) {
        super.GR(view);
        lLA(view);
    }

    @Override // androidx.preference.Preference
    public void U(PreferenceViewHolder preferenceViewHolder) {
        super.U(preferenceViewHolder);
        ER(preferenceViewHolder.nr(android.R.id.checkbox));
        tUK(preferenceViewHolder);
    }

    public CheckBoxPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.n(context, R.attr.f40647n, android.R.attr.checkBoxPreferenceStyle));
    }
}
