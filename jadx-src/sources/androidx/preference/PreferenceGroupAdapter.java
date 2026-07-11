package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class PreferenceGroupAdapter extends RecyclerView.Adapter<PreferenceViewHolder> implements Preference.OnPreferenceChangeInternalListener, PreferenceGroup.PreferencePositionCallback {
    private final Runnable J2 = new Runnable() { // from class: androidx.preference.PreferenceGroupAdapter.1
        @Override // java.lang.Runnable
        public void run() {
            PreferenceGroupAdapter.this.o();
        }
    };

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Handler f40623O = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PreferenceGroup f40624n;
    private final List nr;
    private List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f40625t;

    private static class PreferenceResourceDescriptor {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f40630n;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        String f40631t;

        public boolean equals(Object obj) {
            if (!(obj instanceof PreferenceResourceDescriptor)) {
                return false;
            }
            PreferenceResourceDescriptor preferenceResourceDescriptor = (PreferenceResourceDescriptor) obj;
            return this.f40630n == preferenceResourceDescriptor.f40630n && this.rl == preferenceResourceDescriptor.rl && TextUtils.equals(this.f40631t, preferenceResourceDescriptor.f40631t);
        }

        public int hashCode() {
            return ((((527 + this.f40630n) * 31) + this.rl) * 31) + this.f40631t.hashCode();
        }

        PreferenceResourceDescriptor(Preference preference) {
            this.f40631t = preference.getClass().getName();
            this.f40630n = preference.r();
            this.rl = preference.E2();
        }
    }

    private List az(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iTUK = preferenceGroup.tUK();
        int i2 = 0;
        for (int i3 = 0; i3 < iTUK; i3++) {
            Preference preferenceHow = preferenceGroup.How(i3);
            if (preferenceHow.s7N()) {
                if (!ck(preferenceGroup) || i2 < preferenceGroup.i()) {
                    arrayList.add(preferenceHow);
                } else {
                    arrayList2.add(preferenceHow);
                }
                if (preferenceHow instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceHow;
                    if (!preferenceGroup2.ER()) {
                        continue;
                    } else {
                        if (ck(preferenceGroup) && ck(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : az(preferenceGroup2)) {
                            if (!ck(preferenceGroup) || i2 < preferenceGroup.i()) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i2++;
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        if (ck(preferenceGroup) && i2 > preferenceGroup.i()) {
            arrayList.add(qie(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private ExpandButton qie(final PreferenceGroup preferenceGroup, List list) {
        ExpandButton expandButton = new ExpandButton(preferenceGroup.mUb(), list, preferenceGroup.HI());
        expandButton.fcU(new Preference.OnPreferenceClickListener() { // from class: androidx.preference.PreferenceGroupAdapter.3
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public boolean n(Preference preference) {
                preferenceGroup.RQ(Integer.MAX_VALUE);
                PreferenceGroupAdapter.this.KN(preference);
                PreferenceGroup.OnExpandButtonClickListener onExpandButtonClickListenerK = preferenceGroup.K();
                if (onExpandButtonClickListenerK == null) {
                    return true;
                }
                onExpandButtonClickListenerK.n();
                return true;
            }
        });
        return expandButton;
    }

    public Preference HI(int i2) {
        if (i2 < 0 || i2 >= getItemCount()) {
            return null;
        }
        return (Preference) this.f40625t.get(i2);
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public void KN(Preference preference) {
        this.f40623O.removeCallbacks(this.J2);
        this.f40623O.post(this.J2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f40625t.size();
    }

    @Override // androidx.preference.PreferenceGroup.PreferencePositionCallback
    public int mUb(String str) {
        int size = this.f40625t.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (TextUtils.equals(str, ((Preference) this.f40625t.get(i2)).Ik())) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public void nr(Preference preference) {
        int iIndexOf = this.f40625t.indexOf(preference);
        if (iIndexOf != -1) {
            notifyItemChanged(iIndexOf, preference);
        }
    }

    void o() {
        Iterator it = this.rl.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).Mx(null);
        }
        ArrayList arrayList = new ArrayList(this.rl.size());
        this.rl = arrayList;
        ty(arrayList, this.f40624n);
        final List list = this.f40625t;
        final List listAz = az(this.f40624n);
        this.f40625t = listAz;
        PreferenceManager preferenceManagerNY = this.f40624n.nY();
        if (preferenceManagerNY == null || preferenceManagerNY.Uo() == null) {
            notifyDataSetChanged();
        } else {
            final PreferenceManager.PreferenceComparisonCallback preferenceComparisonCallbackUo = preferenceManagerNY.Uo();
            DiffUtil.rl(new DiffUtil.Callback() { // from class: androidx.preference.PreferenceGroupAdapter.2
                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int O() {
                    return list.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean n(int i2, int i3) {
                    return preferenceComparisonCallbackUo.n((Preference) list.get(i2), (Preference) listAz.get(i3));
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int nr() {
                    return listAz.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean rl(int i2, int i3) {
                    return preferenceComparisonCallbackUo.rl((Preference) list.get(i2), (Preference) listAz.get(i3));
                }
            }).t(this);
        }
        Iterator it2 = this.rl.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).t();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PreferenceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        PreferenceResourceDescriptor preferenceResourceDescriptor = (PreferenceResourceDescriptor) this.nr.get(i2);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, R.styleable.f40689n);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.rl);
        if (drawable == null) {
            drawable = AppCompatResources.rl(viewGroup.getContext(), android.R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(preferenceResourceDescriptor.f40630n, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            ViewCompat.C(viewInflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i3 = preferenceResourceDescriptor.rl;
            if (i3 != 0) {
                layoutInflaterFrom.inflate(i3, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new PreferenceViewHolder(viewInflate);
    }

    @Override // androidx.preference.PreferenceGroup.PreferencePositionCallback
    public int t(Preference preference) {
        int size = this.f40625t.size();
        for (int i2 = 0; i2 < size; i2++) {
            Preference preference2 = (Preference) this.f40625t.get(i2);
            if (preference2 != null && preference2.equals(preference)) {
                return i2;
            }
        }
        return -1;
    }

    public PreferenceGroupAdapter(PreferenceGroup preferenceGroup) {
        this.f40624n = preferenceGroup;
        preferenceGroup.Mx(this);
        this.rl = new ArrayList();
        this.f40625t = new ArrayList();
        this.nr = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).QZ6());
        } else {
            setHasStableIds(true);
        }
        o();
    }

    private boolean ck(PreferenceGroup preferenceGroup) {
        if (preferenceGroup.i() != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    private void ty(List list, PreferenceGroup preferenceGroup) {
        preferenceGroup.F();
        int iTUK = preferenceGroup.tUK();
        for (int i2 = 0; i2 < iTUK; i2++) {
            Preference preferenceHow = preferenceGroup.How(i2);
            list.add(preferenceHow);
            PreferenceResourceDescriptor preferenceResourceDescriptor = new PreferenceResourceDescriptor(preferenceHow);
            if (!this.nr.contains(preferenceResourceDescriptor)) {
                this.nr.add(preferenceResourceDescriptor);
            }
            if (preferenceHow instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceHow;
                if (preferenceGroup2.ER()) {
                    ty(list, preferenceGroup2);
                }
            }
            preferenceHow.Mx(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder, int i2) {
        Preference preferenceHI = HI(i2);
        preferenceViewHolder.Uo();
        preferenceHI.U(preferenceViewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i2) {
        if (!hasStableIds()) {
            return -1L;
        }
        return HI(i2).HI();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        PreferenceResourceDescriptor preferenceResourceDescriptor = new PreferenceResourceDescriptor(HI(i2));
        int iIndexOf = this.nr.indexOf(preferenceResourceDescriptor);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = this.nr.size();
        this.nr.add(preferenceResourceDescriptor);
        return size;
    }
}
