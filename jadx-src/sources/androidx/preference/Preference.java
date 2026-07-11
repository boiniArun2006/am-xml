package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.preference.PreferenceManager;
import cS.Zv.SzFNXybiSxdx;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Preference implements Comparable<Preference> {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f40542B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f40543D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f40544E;
    private CharSequence E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private boolean f40545FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private boolean f40546GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f40547I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f40548J;
    private long J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f40549M;
    private boolean M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private String f40550N;
    private boolean Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private PreferenceDataStore f40551O;
    private boolean P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f40552S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Drawable f40553T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f40554U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f40555X;
    private String Xw;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private int f40556Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private OnPreferenceClickListener f40557Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40558a;
    private OnPreferenceChangeInternalListener dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f40559e;
    private Object eF;
    private OnPreferenceCopyListener eTf;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f40560g;
    private boolean ijL;
    private Bundle jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f40561k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f40562m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f40563n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private OnPreferenceChangeListener f40564o;
    private String p5;
    private final View.OnClickListener pJg;
    private PreferenceGroup piY;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f40565r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PreferenceManager f40566t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Intent f40567v;
    private SummaryProvider xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List f40568z;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static class BaseSavedState extends AbsSavedState {

        @NonNull
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new Parcelable.Creator<BaseSavedState>() { // from class: androidx.preference.Preference.BaseSavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public BaseSavedState[] newArray(int i2) {
                return new BaseSavedState[i2];
            }
        };

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    interface OnPreferenceChangeInternalListener {
        void KN(Preference preference);

        void nr(Preference preference);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface OnPreferenceChangeListener {
        boolean n(Preference preference, Object obj);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface OnPreferenceClickListener {
        boolean n(Preference preference);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private static class OnPreferenceCopyListener implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Preference f40570n;

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence charSequenceTe = this.f40570n.te();
            if (!this.f40570n.X() || TextUtils.isEmpty(charSequenceTe)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceTe);
            contextMenu.add(0, 0, 0, R.string.f40658n).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f40570n.mUb().getSystemService("clipboard");
            CharSequence charSequenceTe = this.f40570n.te();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceTe));
            Toast.makeText(this.f40570n.mUb(), this.f40570n.mUb().getString(R.string.nr, charSequenceTe), 0).show();
            return true;
        }

        OnPreferenceCopyListener(Preference preference) {
            this.f40570n = preference;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface SummaryProvider<T extends Preference> {
        CharSequence n(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f40552S = Integer.MAX_VALUE;
        this.f40560g = 0;
        this.f40554U = true;
        this.P5 = true;
        this.M7 = true;
        this.f40544E = true;
        this.f40549M = true;
        this.f40545FX = true;
        this.f40542B = true;
        this.f40548J = true;
        this.f40558a = true;
        this.Nxk = true;
        int i5 = R.layout.rl;
        this.f40556Y = i5;
        this.pJg = new View.OnClickListener() { // from class: androidx.preference.Preference.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Preference.this.GR(view);
            }
        };
        this.f40563n = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.nHg, i2, i3);
        this.f40555X = TypedArrayUtils.qie(typedArrayObtainStyledAttributes, R.styleable.f40687k, R.styleable.s7N, 0);
        this.f40550N = TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.piY, R.styleable.jB);
        this.E2 = TypedArrayUtils.ty(typedArrayObtainStyledAttributes, R.styleable.Mx, R.styleable.bzg);
        this.f40559e = TypedArrayUtils.ty(typedArrayObtainStyledAttributes, R.styleable.f40662C, R.styleable.f40677U);
        this.f40552S = TypedArrayUtils.nr(typedArrayObtainStyledAttributes, R.styleable.f40688m, R.styleable.P5, Integer.MAX_VALUE);
        this.Xw = TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.f40680Y, R.styleable.f40672M);
        this.f40556Y = TypedArrayUtils.qie(typedArrayObtainStyledAttributes, R.styleable.ijL, R.styleable.rV9, i5);
        this.f40561k = TypedArrayUtils.qie(typedArrayObtainStyledAttributes, R.styleable.f40667G7, R.styleable.M7, 0);
        this.f40554U = TypedArrayUtils.rl(typedArrayObtainStyledAttributes, R.styleable.Nxk, R.styleable.f40693v, true);
        this.P5 = TypedArrayUtils.rl(typedArrayObtainStyledAttributes, R.styleable.xg, R.styleable.Xw, true);
        this.M7 = TypedArrayUtils.rl(typedArrayObtainStyledAttributes, R.styleable.eTf, R.styleable.wTp, true);
        this.p5 = TypedArrayUtils.az(typedArrayObtainStyledAttributes, R.styleable.f40669I, R.styleable.p5);
        int i7 = R.styleable.f40670J;
        this.f40542B = TypedArrayUtils.rl(typedArrayObtainStyledAttributes, i7, i7, this.P5);
        int i8 = R.styleable.f40663D;
        this.f40548J = TypedArrayUtils.rl(typedArrayObtainStyledAttributes, i8, i8, this.P5);
        int i9 = R.styleable.f40682a;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            this.eF = eF(typedArrayObtainStyledAttributes, i9);
        } else {
            int i10 = R.styleable.eF;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.eF = eF(typedArrayObtainStyledAttributes, i10);
            }
        }
        this.Nxk = TypedArrayUtils.rl(typedArrayObtainStyledAttributes, R.styleable.pJg, R.styleable.f40664E, true);
        int i11 = R.styleable.ofS;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i11);
        this.f40543D = zHasValue;
        if (zHasValue) {
            this.f40558a = TypedArrayUtils.rl(typedArrayObtainStyledAttributes, i11, R.styleable.f40666FX, true);
        }
        this.f40547I = TypedArrayUtils.rl(typedArrayObtainStyledAttributes, R.styleable.dR0, R.styleable.f40661B, false);
        int i12 = R.styleable.f40694z;
        this.f40545FX = TypedArrayUtils.rl(typedArrayObtainStyledAttributes, i12, i12, true);
        int i13 = R.styleable.f40668GR;
        this.f40546GR = TypedArrayUtils.rl(typedArrayObtainStyledAttributes, i13, i13, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    protected void B(Parcelable parcelable) {
        this.f40562m = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    protected void D(Object obj) {
    }

    public void E(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    protected Parcelable J() {
        this.f40562m = true;
        return AbsSavedState.EMPTY_STATE;
    }

    protected void P5() {
    }

    protected Object eF(TypedArray typedArray, int i2) {
        return null;
    }

    final void t() {
        this.ijL = false;
    }

    private void GD(Preference preference) {
        List list = this.f40568z;
        if (list != null) {
            list.remove(preference);
        }
    }

    private void HV() {
        Preference preferenceXMQ;
        String str = this.p5;
        if (str == null || (preferenceXMQ = xMQ(str)) == null) {
            return;
        }
        preferenceXMQ.GD(this);
    }

    private void Org(SharedPreferences.Editor editor) {
        if (this.f40566t.r()) {
            editor.apply();
        }
    }

    private void piY(Preference preference) {
        if (this.f40568z == null) {
            this.f40568z = new ArrayList();
        }
        this.f40568z.add(preference);
        preference.M7(this, qm());
    }

    private void z() {
        if (TextUtils.isEmpty(this.p5)) {
            return;
        }
        Preference preferenceXMQ = xMQ(this.p5);
        if (preferenceXMQ != null) {
            preferenceXMQ.piY(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.p5 + SzFNXybiSxdx.AgRjgb + this.f40550N + "\" (title: \"" + ((Object) this.E2) + "\"");
    }

    public void C(int i2) {
        this.f40556Y = i2;
    }

    public final int E2() {
        return this.f40561k;
    }

    public void G7(OnPreferenceChangeListener onPreferenceChangeListener) {
        this.f40564o = onPreferenceChangeListener;
    }

    long HI() {
        return this.J2;
    }

    public String Ik() {
        return this.f40550N;
    }

    public void Jk(int i2) {
        Rl(this.f40563n.getString(i2));
    }

    public void M(Preference preference, boolean z2) {
        if (this.f40549M == z2) {
            this.f40549M = !z2;
            v(qm());
            wTp();
        }
    }

    public void M7(Preference preference, boolean z2) {
        if (this.f40544E == z2) {
            this.f40544E = !z2;
            v(qm());
            wTp();
        }
    }

    final void Mx(OnPreferenceChangeInternalListener onPreferenceChangeInternalListener) {
        this.dR0 = onPreferenceChangeInternalListener;
    }

    public boolean N() {
        return this.M7;
    }

    final boolean Po6() {
        return this.ijL;
    }

    public void Rl(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.E2)) {
            return;
        }
        this.E2 = charSequence;
        wTp();
    }

    public boolean T() {
        return this.f40554U && this.f40544E && this.f40549M;
    }

    public void U(PreferenceViewHolder preferenceViewHolder) {
        Integer numValueOf;
        View view = preferenceViewHolder.itemView;
        view.setOnClickListener(this.pJg);
        view.setId(this.f40560g);
        TextView textView = (TextView) preferenceViewHolder.nr(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceTe = te();
            if (TextUtils.isEmpty(charSequenceTe)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceTe);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) preferenceViewHolder.nr(android.R.id.title);
        if (textView2 != null) {
            CharSequence charSequenceFD = fD();
            if (TextUtils.isEmpty(charSequenceFD)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequenceFD);
                textView2.setVisibility(0);
                if (this.f40543D) {
                    textView2.setSingleLine(this.f40558a);
                }
                if (!nHg() && T() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) preferenceViewHolder.nr(android.R.id.icon);
        if (imageView != null) {
            int i2 = this.f40555X;
            if (i2 != 0 || this.f40553T != null) {
                if (this.f40553T == null) {
                    this.f40553T = AppCompatResources.rl(this.f40563n, i2);
                }
                Drawable drawable = this.f40553T;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f40553T != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.f40547I ? 4 : 8);
            }
        }
        View viewNr = preferenceViewHolder.nr(R.id.f40652n);
        if (viewNr == null) {
            viewNr = preferenceViewHolder.nr(android.R.id.icon_frame);
        }
        if (viewNr != null) {
            if (this.f40553T != null) {
                viewNr.setVisibility(0);
            } else {
                viewNr.setVisibility(this.f40547I ? 4 : 8);
            }
        }
        if (this.Nxk) {
            eTf(view, T());
        } else {
            eTf(view, true);
        }
        boolean zNHg = nHg();
        view.setFocusable(zNHg);
        view.setClickable(zNHg);
        preferenceViewHolder.KN(this.f40542B);
        preferenceViewHolder.xMQ(this.f40548J);
        boolean zX = X();
        if (zX && this.eTf == null) {
            this.eTf = new OnPreferenceCopyListener(this);
        }
        view.setOnCreateContextMenuListener(zX ? this.eTf : null);
        view.setLongClickable(zX);
        if (!zX || zNHg) {
            return;
        }
        ViewCompat.C(view, null);
    }

    public PreferenceDataStore ViF() {
        PreferenceDataStore preferenceDataStore = this.f40551O;
        if (preferenceDataStore != null) {
            return preferenceDataStore;
        }
        PreferenceManager preferenceManager = this.f40566t;
        if (preferenceManager != null) {
            return preferenceManager.KN();
        }
        return null;
    }

    public boolean X() {
        return this.f40546GR;
    }

    protected void Xw(PreferenceManager preferenceManager) {
        this.f40566t = preferenceManager;
        if (!this.f40565r) {
            this.J2 = preferenceManager.nr();
        }
        KN();
    }

    public PreferenceGroup Z() {
        return this.piY;
    }

    public String az() {
        return this.Xw;
    }

    public Intent ck() {
        return this.f40567v;
    }

    public boolean e() {
        return !TextUtils.isEmpty(this.f40550N);
    }

    public void eWT(int i2) {
        if (i2 != this.f40552S) {
            this.f40552S = i2;
            rV9();
        }
    }

    public CharSequence fD() {
        return this.E2;
    }

    public void fcU(OnPreferenceClickListener onPreferenceClickListener) {
        this.f40557Z = onPreferenceClickListener;
    }

    public SharedPreferences g() {
        if (this.f40566t == null || ViF() != null) {
            return null;
        }
        return this.f40566t.mUb();
    }

    public Bundle gh() {
        if (this.jB == null) {
            this.jB = new Bundle();
        }
        return this.jB;
    }

    public final SummaryProvider iF() {
        return this.xg;
    }

    protected void jB(PreferenceManager preferenceManager, long j2) {
        this.J2 = j2;
        this.f40565r = true;
        try {
            Xw(preferenceManager);
        } finally {
            this.f40565r = false;
        }
    }

    public Context mUb() {
        return this.f40563n;
    }

    protected boolean mYa() {
        return this.f40566t != null && N() && e();
    }

    void n(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.piY != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.piY = preferenceGroup;
    }

    public final void n1(SummaryProvider summaryProvider) {
        this.xg = summaryProvider;
        wTp();
    }

    public boolean nHg() {
        return this.P5;
    }

    public PreferenceManager nY() {
        return this.f40566t;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i2 = this.f40552S;
        int i3 = preference.f40552S;
        if (i2 != i3) {
            return i2 - i3;
        }
        CharSequence charSequence = this.E2;
        CharSequence charSequence2 = preference.E2;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.E2.toString());
    }

    public int o() {
        return this.f40552S;
    }

    public void ofS(Intent intent) {
        this.f40567v = intent;
    }

    public void pJg(Drawable drawable) {
        if (this.f40553T != drawable) {
            this.f40553T = drawable;
            this.f40555X = 0;
            wTp();
        }
    }

    StringBuilder qie() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequenceFD = fD();
        if (!TextUtils.isEmpty(charSequenceFD)) {
            sb.append(charSequenceFD);
            sb.append(' ');
        }
        CharSequence charSequenceTe = te();
        if (!TextUtils.isEmpty(charSequenceTe)) {
            sb.append(charSequenceTe);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public final int r() {
        return this.f40556Y;
    }

    protected void rV9() {
        OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.dR0;
        if (onPreferenceChangeInternalListener != null) {
            onPreferenceChangeInternalListener.KN(this);
        }
    }

    public boolean rl(Object obj) {
        OnPreferenceChangeListener onPreferenceChangeListener = this.f40564o;
        return onPreferenceChangeListener == null || onPreferenceChangeListener.n(this, obj);
    }

    public final boolean s7N() {
        return this.f40545FX;
    }

    public Drawable ty() {
        int i2;
        if (this.f40553T == null && (i2 = this.f40555X) != 0) {
            this.f40553T = AppCompatResources.rl(this.f40563n, i2);
        }
        return this.f40553T;
    }

    public void v(boolean z2) {
        List list = this.f40568z;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Preference) list.get(i2)).M7(this, z2);
        }
    }

    protected void wTp() {
        OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.dR0;
        if (onPreferenceChangeInternalListener != null) {
            onPreferenceChangeInternalListener.nr(this);
        }
    }

    protected Preference xMQ(String str) {
        PreferenceManager preferenceManager = this.f40566t;
        if (preferenceManager == null) {
            return null;
        }
        return preferenceManager.n(str);
    }

    public void xg(int i2) {
        pJg(AppCompatResources.rl(this.f40563n, i2));
        this.f40555X = i2;
    }

    private void KN() {
        if (ViF() != null) {
            a(true, this.eF);
            return;
        }
        if (mYa() && g().contains(this.f40550N)) {
            a(true, null);
            return;
        }
        Object obj = this.eF;
        if (obj != null) {
            a(false, obj);
        }
    }

    private void eTf(View view, boolean z2) {
        view.setEnabled(z2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                eTf(viewGroup.getChildAt(childCount), z2);
            }
        }
    }

    protected void FX() {
        HV();
    }

    protected void GR(View view) {
        I();
    }

    public void I() {
        PreferenceManager.OnPreferenceTreeClickListener onPreferenceTreeClickListenerJ2;
        if (T() && nHg()) {
            P5();
            OnPreferenceClickListener onPreferenceClickListener = this.f40557Z;
            if (onPreferenceClickListener == null || !onPreferenceClickListener.n(this)) {
                PreferenceManager preferenceManagerNY = nY();
                if ((preferenceManagerNY == null || (onPreferenceTreeClickListenerJ2 = preferenceManagerNY.J2()) == null || !onPreferenceTreeClickListenerJ2.az(this)) && this.f40567v != null) {
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(mUb(), this.f40567v);
                }
            }
        }
    }

    void J2(Bundle bundle) {
        Parcelable parcelable;
        if (e() && (parcelable = bundle.getParcelable(this.f40550N)) != null) {
            this.f40562m = false;
            B(parcelable);
            if (!this.f40562m) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    protected boolean Nxk(boolean z2) {
        if (!mYa()) {
            return false;
        }
        if (z2 == XQ(!z2)) {
            return true;
        }
        PreferenceDataStore preferenceDataStoreViF = ViF();
        if (preferenceDataStoreViF != null) {
            preferenceDataStoreViF.O(this.f40550N, z2);
        } else {
            SharedPreferences.Editor editorT = this.f40566t.t();
            editorT.putBoolean(this.f40550N, z2);
            Org(editorT);
        }
        return true;
    }

    protected int S(int i2) {
        if (!mYa()) {
            return i2;
        }
        PreferenceDataStore preferenceDataStoreViF = ViF();
        if (preferenceDataStoreViF != null) {
            return preferenceDataStoreViF.rl(this.f40550N, i2);
        }
        return this.f40566t.mUb().getInt(this.f40550N, i2);
    }

    void Uo(Bundle bundle) {
        if (e()) {
            this.f40562m = false;
            Parcelable parcelableJ = J();
            if (this.f40562m) {
                if (parcelableJ != null) {
                    bundle.putParcelable(this.f40550N, parcelableJ);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
    }

    protected String WPU(String str) {
        if (!mYa()) {
            return str;
        }
        PreferenceDataStore preferenceDataStoreViF = ViF();
        if (preferenceDataStoreViF != null) {
            return preferenceDataStoreViF.t(this.f40550N, str);
        }
        return this.f40566t.mUb().getString(this.f40550N, str);
    }

    protected boolean XQ(boolean z2) {
        if (!mYa()) {
            return z2;
        }
        PreferenceDataStore preferenceDataStoreViF = ViF();
        if (preferenceDataStoreViF != null) {
            return preferenceDataStoreViF.n(this.f40550N, z2);
        }
        return this.f40566t.mUb().getBoolean(this.f40550N, z2);
    }

    protected boolean Y(int i2) {
        if (!mYa()) {
            return false;
        }
        if (i2 == S(~i2)) {
            return true;
        }
        PreferenceDataStore preferenceDataStoreViF = ViF();
        if (preferenceDataStoreViF != null) {
            preferenceDataStoreViF.J2(this.f40550N, i2);
        } else {
            SharedPreferences.Editor editorT = this.f40566t.t();
            editorT.putInt(this.f40550N, i2);
            Org(editorT);
        }
        return true;
    }

    protected void a(boolean z2, Object obj) {
        D(obj);
    }

    public Set aYN(Set set) {
        if (!mYa()) {
            return set;
        }
        PreferenceDataStore preferenceDataStoreViF = ViF();
        if (preferenceDataStoreViF != null) {
            return preferenceDataStoreViF.nr(this.f40550N, set);
        }
        return this.f40566t.mUb().getStringSet(this.f40550N, set);
    }

    public void bzg() {
        z();
    }

    public boolean dR0(Set set) {
        if (!mYa()) {
            return false;
        }
        if (set.equals(aYN(null))) {
            return true;
        }
        PreferenceDataStore preferenceDataStoreViF = ViF();
        if (preferenceDataStoreViF != null) {
            preferenceDataStoreViF.KN(this.f40550N, set);
        } else {
            SharedPreferences.Editor editorT = this.f40566t.t();
            editorT.putStringSet(this.f40550N, set);
            Org(editorT);
        }
        return true;
    }

    public void ijL(Bundle bundle) {
        J2(bundle);
    }

    protected boolean k(String str) {
        if (!mYa()) {
            return false;
        }
        if (TextUtils.equals(str, WPU(null))) {
            return true;
        }
        PreferenceDataStore preferenceDataStoreViF = ViF();
        if (preferenceDataStoreViF != null) {
            preferenceDataStoreViF.Uo(this.f40550N, str);
        } else {
            SharedPreferences.Editor editorT = this.f40566t.t();
            editorT.putString(this.f40550N, str);
            Org(editorT);
        }
        return true;
    }

    public void m(Bundle bundle) {
        Uo(bundle);
    }

    public void p5() {
        HV();
        this.ijL = true;
    }

    public boolean qm() {
        return !T();
    }

    public CharSequence te() {
        if (iF() != null) {
            return iF().n(this);
        }
        return this.f40559e;
    }

    public String toString() {
        return qie().toString();
    }

    public void ul(CharSequence charSequence) {
        if (iF() == null) {
            if (!TextUtils.equals(this.f40559e, charSequence)) {
                this.f40559e = charSequence;
                wTp();
                return;
            }
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }

    public Preference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.n(context, R.attr.xMQ, android.R.attr.preferenceStyle));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
