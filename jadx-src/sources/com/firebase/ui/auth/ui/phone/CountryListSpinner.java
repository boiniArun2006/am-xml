package com.firebase.ui.auth.ui.phone;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ListPopupWindow;
import com.firebase.ui.auth.R$attr;
import com.firebase.ui.auth.R$layout;
import com.firebase.ui.auth.data.model.CountryInfo;
import com.firebase.ui.auth.util.data.PhoneNumberUtils;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class CountryListSpinner extends TextInputEditText implements View.OnClickListener {
    private Set<String> mAllowedCountryIsos;
    private Set<String> mBlockedCountryIsos;
    private final ArrayAdapter<CountryInfo> mCountryListAdapter;
    private ListPopupWindow mListPopupWindow;
    private View.OnClickListener mListener;
    private CountryInfo mSelectedCountryInfo;

    public CountryListSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.editTextStyle);
    }

    public void setSelectedForCountry(int i2, Locale locale) {
        CountryInfo countryInfo = new CountryInfo(locale, i2);
        this.mSelectedCountryInfo = countryInfo;
        setText(countryInfo.toShortString());
    }

    public CountryListSpinner(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mAllowedCountryIsos = new HashSet();
        this.mBlockedCountryIsos = new HashSet();
        super.setOnClickListener(this);
        this.mCountryListAdapter = new ArrayAdapter<>(getContext(), R$layout.fui_dgts_country_row, R.id.text1);
        ListPopupWindow listPopupWindow = new ListPopupWindow(context, null, R$attr.listPopupWindowStyle);
        this.mListPopupWindow = listPopupWindow;
        listPopupWindow.N(true);
        setInputType(0);
        this.mListPopupWindow.s7N(new AdapterView.OnItemClickListener() { // from class: com.firebase.ui.auth.ui.phone.CountryListSpinner.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j2) {
                CountryInfo countryInfo = (CountryInfo) CountryListSpinner.this.mCountryListAdapter.getItem(i3);
                if (countryInfo != null) {
                    CountryListSpinner.this.setSelectedForCountry(countryInfo.getCountryCode(), countryInfo.getLocale());
                }
                CountryListSpinner.this.onUnfocus();
            }
        });
    }

    private Set<String> convertCodesToIsos(@NonNull List<String> list) {
        HashSet hashSet = new HashSet();
        for (String str : list) {
            if (PhoneNumberUtils.isValid(str)) {
                hashSet.addAll(PhoneNumberUtils.getCountryIsosFromCountryCode(str));
            } else {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    private void executeUserClickListener(View view) {
        View.OnClickListener onClickListener = this.mListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        onFocus();
    }

    private static void hideKeyboard(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private void initCountrySpinnerIsosFromParams(@NonNull Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowlisted_countries");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("blocklisted_countries");
        if (stringArrayList != null) {
            this.mAllowedCountryIsos = convertCodesToIsos(stringArrayList);
        }
        if (stringArrayList2 != null) {
            this.mBlockedCountryIsos = convertCodesToIsos(stringArrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUnfocus() {
        this.mListPopupWindow.dismiss();
    }

    public CountryInfo getSelectedCountryInfo() {
        return this.mSelectedCountryInfo;
    }

    public void init(Bundle bundle, View view) {
        if (bundle != null) {
            List<CountryInfo> countriesToDisplayInSpinner = getCountriesToDisplayInSpinner(bundle);
            setCountriesToDisplay(countriesToDisplayInSpinner);
            setDefaultCountryForSpinner(countriesToDisplayInSpinner);
            this.mListPopupWindow.iF(view);
            this.mListPopupWindow.qie(this.mCountryListAdapter);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("KEY_SUPER_STATE");
        this.mSelectedCountryInfo = (CountryInfo) bundle.getParcelable("KEY_COUNTRY_INFO");
        super.onRestoreInstanceState(parcelable2);
    }

    public void setCountriesToDisplay(List<CountryInfo> list) {
        this.mCountryListAdapter.addAll(list);
        this.mCountryListAdapter.notifyDataSetChanged();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mListener = onClickListener;
    }

    private List<CountryInfo> getCountriesToDisplayInSpinner(Bundle bundle) {
        initCountrySpinnerIsosFromParams(bundle);
        Map<String, Integer> immutableCountryIsoMap = PhoneNumberUtils.getImmutableCountryIsoMap();
        if (this.mAllowedCountryIsos.isEmpty() && this.mBlockedCountryIsos.isEmpty()) {
            this.mAllowedCountryIsos = new HashSet(immutableCountryIsoMap.keySet());
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (!this.mBlockedCountryIsos.isEmpty()) {
            hashSet.addAll(this.mBlockedCountryIsos);
        } else {
            hashSet.addAll(immutableCountryIsoMap.keySet());
            hashSet.removeAll(this.mAllowedCountryIsos);
        }
        for (String str : immutableCountryIsoMap.keySet()) {
            if (!hashSet.contains(str)) {
                arrayList.add(new CountryInfo(new Locale("", str), immutableCountryIsoMap.get(str).intValue()));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private void onFocus() {
        hideKeyboard(getContext(), this);
        this.mListPopupWindow.show();
    }

    private void setDefaultCountryForSpinner(List<CountryInfo> list) {
        CountryInfo currentCountryInfo = PhoneNumberUtils.getCurrentCountryInfo(getContext());
        if (isValidIso(currentCountryInfo.getLocale().getCountry())) {
            setSelectedForCountry(currentCountryInfo.getCountryCode(), currentCountryInfo.getLocale());
        } else if (list.iterator().hasNext()) {
            CountryInfo next = list.iterator().next();
            setSelectedForCountry(next.getCountryCode(), next.getLocale());
        }
    }

    public boolean isValidIso(String str) {
        boolean zContains;
        String upperCase = str.toUpperCase(Locale.getDefault());
        if (!this.mAllowedCountryIsos.isEmpty()) {
            zContains = this.mAllowedCountryIsos.contains(upperCase);
        } else {
            zContains = true;
        }
        if (!this.mBlockedCountryIsos.isEmpty()) {
            if (zContains && !this.mBlockedCountryIsos.contains(upperCase)) {
                return true;
            }
            return false;
        }
        return zContains;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        hideKeyboard(getContext(), this);
        executeUserClickListener(view);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (z2) {
            onFocus();
        } else {
            onUnfocus();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY_SUPER_STATE", parcelableOnSaveInstanceState);
        bundle.putParcelable("KEY_COUNTRY_INFO", this.mSelectedCountryInfo);
        return bundle;
    }

    public void setSelectedForCountry(Locale locale, String str) {
        if (!isValidIso(locale.getCountry()) || TextUtils.isEmpty(locale.getDisplayName()) || TextUtils.isEmpty(str)) {
            return;
        }
        setSelectedForCountry(Integer.parseInt(str), locale);
    }
}
