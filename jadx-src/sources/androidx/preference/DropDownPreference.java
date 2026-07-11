package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class DropDownPreference extends ListPreference {
    private final AdapterView.OnItemSelectedListener GD;
    private Spinner HV;
    private final ArrayAdapter Org;
    private final Context mYa;

    public DropDownPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f40648t);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    private void tFV() {
        this.Org.clear();
        if (ER() != null) {
            for (CharSequence charSequence : ER()) {
                this.Org.add(charSequence.toString());
            }
        }
    }

    protected ArrayAdapter F() {
        return new ArrayAdapter(this.mYa, android.R.layout.simple_spinner_dropdown_item);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void P5() {
        this.HV.performClick();
    }

    @Override // androidx.preference.Preference
    public void U(PreferenceViewHolder preferenceViewHolder) {
        Spinner spinner = (Spinner) preferenceViewHolder.itemView.findViewById(R.id.KN);
        this.HV = spinner;
        spinner.setAdapter((SpinnerAdapter) this.Org);
        this.HV.setOnItemSelectedListener(this.GD);
        this.HV.setSelection(QZ6(W()));
        super.U(preferenceViewHolder);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.GD = new AdapterView.OnItemSelectedListener() { // from class: androidx.preference.DropDownPreference.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView adapterView, View view, int i5, long j2) {
                if (i5 >= 0) {
                    String string = DropDownPreference.this.kSg()[i5].toString();
                    if (string.equals(DropDownPreference.this.W()) || !DropDownPreference.this.rl(string)) {
                        return;
                    }
                    DropDownPreference.this.a63(string);
                }
            }
        };
        this.mYa = context;
        this.Org = F();
        tFV();
    }

    private int QZ6(String str) {
        CharSequence[] charSequenceArrKSg = kSg();
        if (str != null && charSequenceArrKSg != null) {
            for (int length = charSequenceArrKSg.length - 1; length >= 0; length--) {
                if (TextUtils.equals(charSequenceArrKSg[length].toString(), str)) {
                    return length;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // androidx.preference.Preference
    protected void wTp() {
        super.wTp();
        ArrayAdapter arrayAdapter = this.Org;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
