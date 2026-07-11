package androidx.appcompat.widget;

import android.R;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.customview.view.AbsSavedState;
import com.safedk.android.utils.Logger;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    static final PreQAutoCompleteTextViewReflector f14293K;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final View f14294B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private View.OnClickListener f14295C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Rect f14296D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final ImageView f14297E;
    private Bundle EWS;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    final ImageView f14298FX;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private boolean f14299G7;
    private int GD;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private int[] f14300GR;
    private boolean HV;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int[] f14301I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private UpdatableTouchDelegate f14302J;
    private boolean Jk;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final ImageView f14303M;
    private final View M7;
    private boolean Mx;
    private final ImageView Nxk;
    private CharSequence Org;
    private final View P5;
    SearchableInfo Po6;
    private int Rl;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    final SearchAutoComplete f14304U;
    private Runnable UhV;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rect f14305a;
    private final int dR0;
    final ImageView eF;
    private OnQueryTextListener eTf;
    private boolean eWT;
    CursorAdapter fcU;
    private final Runnable hRu;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final WeakHashMap f14306i;
    private final Intent ijL;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Drawable f14307k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final CharSequence f14308m;
    private CharSequence mYa;
    private boolean n1;
    private OnSuggestionListener ofS;
    private final View p5;
    View.OnFocusChangeListener pJg;
    private final Intent piY;
    private boolean qm;
    private CharSequence ul;
    private OnCloseListener xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f14309z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SearchView f14310n;

        @Override // java.lang.Runnable
        public void run() {
            this.f14310n.dR0();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$10, reason: invalid class name */
    class AnonymousClass10 implements TextWatcher {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SearchView f14311n;

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
            this.f14311n.D(charSequence);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$2, reason: invalid class name */
    class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SearchView f14312n;

        @Override // java.lang.Runnable
        public void run() {
            CursorAdapter cursorAdapter = this.f14312n.fcU;
            if (cursorAdapter instanceof SuggestionsAdapter) {
                cursorAdapter.rl(null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$3, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    class AnonymousClass3 implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SearchView f14313n;

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z2) {
            SearchView searchView = this.f14313n;
            View.OnFocusChangeListener onFocusChangeListener = searchView.pJg;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$4, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    class AnonymousClass4 implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SearchView f14314n;

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11) {
            this.f14314n.fD();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$5, reason: invalid class name */
    class AnonymousClass5 implements View.OnClickListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SearchView f14315n;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = this.f14315n;
            if (view == searchView.eF) {
                searchView.FX();
                return;
            }
            if (view == searchView.f14303M) {
                searchView.p5();
                return;
            }
            if (view == searchView.f14297E) {
                searchView.B();
            } else if (view == searchView.f14298FX) {
                searchView.I();
            } else if (view == searchView.f14304U) {
                searchView.nHg();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$6, reason: invalid class name */
    class AnonymousClass6 implements View.OnKeyListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SearchView f14316n;

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = this.f14316n;
            if (searchView.Po6 == null) {
                return false;
            }
            if (searchView.f14304U.isPopupShowing() && this.f14316n.f14304U.getListSelection() != -1) {
                return this.f14316n.J(view, i2, keyEvent);
            }
            if (this.f14316n.f14304U.t() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = this.f14316n;
            searchView2.P5(0, null, searchView2.f14304U.getText().toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$7, reason: invalid class name */
    class AnonymousClass7 implements TextView.OnEditorActionListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SearchView f14317n;

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            this.f14317n.B();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$8, reason: invalid class name */
    class AnonymousClass8 implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SearchView f14318n;

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
            this.f14318n.eF(i2, 0, null);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$9, reason: invalid class name */
    class AnonymousClass9 implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SearchView f14319n;

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
            this.f14319n.E(i2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f14320O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f14321n;
        private int nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f14322t;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.rl = propertyMapper.mapInt("imeOptions", R.attr.imeOptions);
            this.f14322t = propertyMapper.mapInt("maxWidth", R.attr.maxWidth);
            this.nr = propertyMapper.mapBoolean("iconifiedByDefault", androidx.appcompat.R.attr.f13422J);
            this.f14320O = propertyMapper.mapObject("queryHint", androidx.appcompat.R.attr.f13438m);
            this.f14321n = true;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void readProperties(SearchView searchView, PropertyReader propertyReader) {
            if (!this.f14321n) {
                throw w6.n();
            }
            propertyReader.readInt(this.rl, searchView.getImeOptions());
            propertyReader.readInt(this.f14322t, searchView.getMaxWidth());
            propertyReader.readBoolean(this.nr, searchView.rV9());
            propertyReader.readObject(this.f14320O, searchView.getQueryHint());
        }
    }

    public interface OnCloseListener {
        boolean onClose();
    }

    public interface OnQueryTextListener {
        boolean n(String str);

        boolean rl(String str);
    }

    public interface OnSuggestionListener {
        boolean n(int i2);

        boolean rl(int i2);
    }

    private static class PreQAutoCompleteTextViewReflector {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Method f14323n;
        private Method rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Method f14324t;

        PreQAutoCompleteTextViewReflector() {
            this.f14323n = null;
            this.rl = null;
            this.f14324t = null;
            nr();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f14323n = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.rl = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f14324t = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void nr() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void n(AutoCompleteTextView autoCompleteTextView) {
            nr();
            Method method = this.rl;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void rl(AutoCompleteTextView autoCompleteTextView) {
            nr();
            Method method = this.f14323n;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void t(AutoCompleteTextView autoCompleteTextView) {
            nr();
            Method method = this.f14324t;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.widget.SearchView.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f14325O;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14325O = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f14325O + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.f14325O));
        }
    }

    @RestrictTo
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private boolean f14326S;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Runnable f14327g;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private SearchView f14328o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f14329r;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, androidx.appcompat.R.attr.Ik);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f14328o.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f14327g = new Runnable() { // from class: androidx.appcompat.widget.SearchView.SearchAutoComplete.1
                @Override // java.lang.Runnable
                public void run() {
                    SearchAutoComplete.this.nr();
                }
            };
            this.f14329r = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f14329r <= 0 || super.enoughToFilter();
        }

        void nr() {
            if (this.f14326S) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f14326S = false;
            }
        }

        void rl() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f14293K.t(this);
                return;
            }
            Api29Impl.rl(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        void setSearchView(SearchView searchView) {
            this.f14328o = searchView;
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                if (i2 < 640 || i3 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f14326S) {
                removeCallbacks(this.f14327g);
                post(this.f14327g);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            this.f14328o.a();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f14328o.hasFocus() && getVisibility() == 0) {
                this.f14326S = true;
                if (SearchView.Xw(getContext())) {
                    rl();
                }
            }
        }

        void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z2) {
                this.f14326S = false;
                removeCallbacks(this.f14327g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.f14326S = false;
                    removeCallbacks(this.f14327g);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.f14326S = true;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f14329r = i2;
        }

        boolean t() {
            if (TextUtils.getTrimmedLength(getText()) == 0) {
                return true;
            }
            return false;
        }
    }

    private static class UpdatableTouchDelegate extends TouchDelegate {
        private boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f14331O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final View f14332n;
        private final Rect nr;
        private final Rect rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Rect f14333t;

        public void n(Rect rect, Rect rect2) {
            this.rl.set(rect);
            this.nr.set(rect);
            Rect rect3 = this.nr;
            int i2 = this.f14331O;
            rect3.inset(-i2, -i2);
            this.f14333t.set(rect2);
        }

        public UpdatableTouchDelegate(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f14331O = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.rl = new Rect();
            this.nr = new Rect();
            this.f14333t = new Rect();
            n(rect, rect2);
            this.f14332n = view;
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z2;
            boolean z3;
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z4 = true;
            if (action != 0) {
                if (action != 1 && action != 2) {
                    if (action == 3) {
                        z3 = this.J2;
                        this.J2 = false;
                    }
                    z2 = true;
                    z4 = false;
                } else {
                    z3 = this.J2;
                    if (z3 && !this.nr.contains(x2, y2)) {
                        z4 = z3;
                        z2 = false;
                    }
                }
                z4 = z3;
                z2 = true;
            } else if (this.rl.contains(x2, y2)) {
                this.J2 = true;
                z2 = true;
            } else {
                z2 = true;
                z4 = false;
            }
            if (!z4) {
                return false;
            }
            if (z2 && !this.f14333t.contains(x2, y2)) {
                motionEvent.setLocation(this.f14332n.getWidth() / 2, this.f14332n.getHeight() / 2);
            } else {
                Rect rect = this.f14333t;
                motionEvent.setLocation(x2 - rect.left, y2 - rect.top);
            }
            return this.f14332n.dispatchTouchEvent(motionEvent);
        }
    }

    private Intent e(Cursor cursor, int i2, String str) {
        int position;
        String strHI;
        try {
            String strHI2 = SuggestionsAdapter.HI(cursor, "suggest_intent_action");
            if (strHI2 == null) {
                strHI2 = this.Po6.getSuggestIntentAction();
            }
            if (strHI2 == null) {
                strHI2 = "android.intent.action.SEARCH";
            }
            String str2 = strHI2;
            String strHI3 = SuggestionsAdapter.HI(cursor, "suggest_intent_data");
            if (strHI3 == null) {
                strHI3 = this.Po6.getSuggestIntentData();
            }
            if (strHI3 != null && (strHI = SuggestionsAdapter.HI(cursor, "suggest_intent_data_id")) != null) {
                strHI3 = strHI3 + "/" + Uri.encode(strHI);
            }
            return E2(str2, strHI3 == null ? null : Uri.parse(strHI3), SuggestionsAdapter.HI(cursor, "suggest_intent_extra_data"), SuggestionsAdapter.HI(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            return null;
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    void FX() {
        eTf(false);
        this.f14304U.requestFocus();
        this.f14304U.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f14295C;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void P5(int i2, String str, String str2) {
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(getContext(), E2("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.Jk = true;
        super.clearFocus();
        this.f14304U.clearFocus();
        this.f14304U.setImeVisibility(false);
        this.Jk = false;
    }

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static void n(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @DoNotInline
        static void rl(SearchAutoComplete searchAutoComplete, int i2) {
            searchAutoComplete.setInputMethodMode(i2);
        }
    }

    static {
        f14293K = Build.VERSION.SDK_INT < 29 ? new PreQAutoCompleteTextViewReflector() : null;
    }

    private Intent E2(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.Org);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.EWS;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.Po6.getSearchActivity());
        return intent;
    }

    private void GR() {
        post(this.hRu);
    }

    private boolean M7(int i2, int i3, String str) {
        Cursor cursorNr = this.fcU.nr();
        if (cursorNr == null || !cursorNr.moveToPosition(i2)) {
            return false;
        }
        U(e(cursorNr, i3, str));
        return true;
    }

    private void N() {
        this.f14304U.dismissDropDown();
    }

    private void Nxk(int i2) {
        Editable text = this.f14304U.getText();
        Cursor cursorNr = this.fcU.nr();
        if (cursorNr == null) {
            return;
        }
        if (!cursorNr.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceN = this.fcU.n(cursorNr);
        if (charSequenceN != null) {
            setQuery(charSequenceN);
        } else {
            setQuery(text);
        }
    }

    private Intent T(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void U(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(getContext(), intent);
        } catch (RuntimeException e2) {
            Log.e("SearchView", "Failed launch activity: " + intent, e2);
        }
    }

    private void eTf(boolean z2) {
        this.f14299G7 = z2;
        int i2 = 8;
        int i3 = z2 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f14304U.getText());
        this.eF.setVisibility(i3);
        m(!zIsEmpty);
        this.P5.setVisibility(z2 ? 8 : 0);
        if (this.Nxk.getDrawable() != null && !this.Mx) {
            i2 = 0;
        }
        this.Nxk.setVisibility(i2);
        k();
        xg(zIsEmpty);
        ijL();
    }

    private boolean jB() {
        return (this.eWT || this.qm) && !bzg();
    }

    private void k() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f14304U.getText());
        this.f14303M.setVisibility(!zIsEmpty || (this.Mx && !this.HV) ? 0 : 8);
        Drawable drawable = this.f14303M.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void m(boolean z2) {
        this.f14297E.setVisibility((this.eWT && jB() && hasFocus() && (z2 || !this.qm)) ? 0 : 8);
    }

    private void piY() {
        this.f14304U.setThreshold(this.Po6.getSuggestThreshold());
        this.f14304U.setImeOptions(this.Po6.getImeOptions());
        int inputType = this.Po6.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.Po6.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f14304U.setInputType(inputType);
        CursorAdapter cursorAdapter = this.fcU;
        if (cursorAdapter != null) {
            cursorAdapter.rl(null);
        }
        if (this.Po6.getSuggestAuthority() != null) {
            SuggestionsAdapter suggestionsAdapter = new SuggestionsAdapter(getContext(), this, this.Po6, this.f14306i);
            this.fcU = suggestionsAdapter;
            this.f14304U.setAdapter(suggestionsAdapter);
            ((SuggestionsAdapter) this.fcU).aYN(this.n1 ? 2 : 1);
        }
    }

    private void s7N(View view, Rect rect) {
        view.getLocationInWindow(this.f14301I);
        getLocationInWindow(this.f14300GR);
        int[] iArr = this.f14301I;
        int i2 = iArr[1];
        int[] iArr2 = this.f14300GR;
        int i3 = i2 - iArr2[1];
        int i5 = iArr[0] - iArr2[0];
        rect.set(i5, i3, view.getWidth() + i5, view.getHeight() + i3);
    }

    private void setQuery(CharSequence charSequence) {
        this.f14304U.setText(charSequence);
        this.f14304U.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private boolean v() {
        SearchableInfo searchableInfo = this.Po6;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.Po6.getVoiceSearchLaunchWebSearch() ? this.piY : this.Po6.getVoiceSearchLaunchRecognizer() ? this.ijL : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    private CharSequence wTp(CharSequence charSequence) {
        if (!this.Mx || this.f14307k == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f14304U.getTextSize()) * 1.25d);
        this.f14307k.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f14307k), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void xg(boolean z2) {
        int i2 = 8;
        if (this.qm && !bzg() && z2) {
            this.f14297E.setVisibility(8);
            i2 = 0;
        }
        this.f14298FX.setVisibility(i2);
    }

    void B() {
        Editable text = this.f14304U.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        OnQueryTextListener onQueryTextListener = this.eTf;
        if (onQueryTextListener == null || !onQueryTextListener.rl(text.toString())) {
            if (this.Po6 != null) {
                P5(0, null, text.toString());
            }
            this.f14304U.setImeVisibility(false);
            N();
        }
    }

    void D(CharSequence charSequence) {
        Editable text = this.f14304U.getText();
        this.Org = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        m(!zIsEmpty);
        xg(zIsEmpty);
        k();
        ijL();
        if (this.eTf != null && !TextUtils.equals(charSequence, this.mYa)) {
            this.eTf.n(charSequence.toString());
        }
        this.mYa = charSequence.toString();
    }

    boolean E(int i2) {
        OnSuggestionListener onSuggestionListener = this.ofS;
        if (onSuggestionListener != null && onSuggestionListener.n(i2)) {
            return false;
        }
        Nxk(i2);
        return true;
    }

    void I() {
        SearchableInfo searchableInfo = this.Po6;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(getContext(), T(this.piY, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(getContext(), X(this.ijL, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    boolean J(View view, int i2, KeyEvent keyEvent) {
        if (this.Po6 != null && this.fcU != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return eF(this.f14304U.getListSelection(), 0, null);
            }
            if (i2 == 21 || i2 == 22) {
                this.f14304U.setSelection(i2 == 21 ? 0 : this.f14304U.length());
                this.f14304U.setListSelection(0);
                this.f14304U.clearListSelection();
                this.f14304U.rl();
                return true;
            }
            if (i2 == 19) {
                this.f14304U.getListSelection();
                return false;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void J2() {
        Y("", false);
        clearFocus();
        eTf(true);
        this.f14304U.setImeOptions(this.GD);
        this.HV = false;
    }

    public void Y(CharSequence charSequence, boolean z2) {
        this.f14304U.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f14304U;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.Org = charSequence;
        }
        if (!z2 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        B();
    }

    public boolean bzg() {
        return this.f14299G7;
    }

    void dR0() {
        int[] iArr = this.f14304U.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.M7.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.p5.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    boolean eF(int i2, int i3, String str) {
        OnSuggestionListener onSuggestionListener = this.ofS;
        if (onSuggestionListener != null && onSuggestionListener.rl(i2)) {
            return false;
        }
        M7(i2, 0, null);
        this.f14304U.setImeVisibility(false);
        N();
        return true;
    }

    void fD() {
        if (this.f14294B.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.M7.getPaddingLeft();
            Rect rect = new Rect();
            boolean zRl = ViewUtils.rl(this);
            int dimensionPixelSize = this.Mx ? resources.getDimensionPixelSize(androidx.appcompat.R.dimen.f13449O) + resources.getDimensionPixelSize(androidx.appcompat.R.dimen.J2) : 0;
            this.f14304U.getDropDownBackground().getPadding(rect);
            this.f14304U.setDropDownHorizontalOffset(zRl ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f14304U.setDropDownWidth((((this.f14294B.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public int getImeOptions() {
        return this.f14304U.getImeOptions();
    }

    public int getInputType() {
        return this.f14304U.getInputType();
    }

    public int getMaxWidth() {
        return this.Rl;
    }

    public CharSequence getQuery() {
        return this.f14304U.getText();
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.ul;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.Po6;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f14308m : getContext().getText(this.Po6.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f14309z;
    }

    int getSuggestionRowLayout() {
        return this.dR0;
    }

    public CursorAdapter getSuggestionsAdapter() {
        return this.fcU;
    }

    void nHg() {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.n(this.f14304U);
            return;
        }
        PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = f14293K;
        preQAutoCompleteTextViewReflector.rl(this.f14304U);
        preQAutoCompleteTextViewReflector.n(this.f14304U);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.hRu);
        post(this.UhV);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.n());
        eTf(savedState.f14325O);
        requestLayout();
    }

    void p5() {
        if (!TextUtils.isEmpty(this.f14304U.getText())) {
            this.f14304U.setText("");
            this.f14304U.requestFocus();
            this.f14304U.setImeVisibility(true);
        } else if (this.Mx) {
            OnCloseListener onCloseListener = this.xg;
            if (onCloseListener == null || !onCloseListener.onClose()) {
                clearFocus();
                eTf(true);
            }
        }
    }

    public boolean rV9() {
        return this.Mx;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.Jk || !isFocusable()) {
            return false;
        }
        if (bzg()) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.f14304U.requestFocus(i2, rect);
        if (zRequestFocus) {
            eTf(false);
        }
        return zRequestFocus;
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void rl() {
        if (this.HV) {
            return;
        }
        this.HV = true;
        int imeOptions = this.f14304U.getImeOptions();
        this.GD = imeOptions;
        this.f14304U.setImeOptions(imeOptions | 33554432);
        this.f14304U.setText("");
        setIconified(false);
    }

    @RestrictTo
    public void setAppSearchData(Bundle bundle) {
        this.EWS = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            p5();
        } else {
            FX();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.Mx == z2) {
            return;
        }
        this.Mx = z2;
        eTf(z2);
        z();
    }

    public void setImeOptions(int i2) {
        this.f14304U.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f14304U.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.Rl = i2;
        requestLayout();
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.xg = onCloseListener;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.pJg = onFocusChangeListener;
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
        this.eTf = onQueryTextListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f14295C = onClickListener;
    }

    public void setOnSuggestionListener(OnSuggestionListener onSuggestionListener) {
        this.ofS = onSuggestionListener;
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.ul = charSequence;
        z();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.n1 = z2;
        CursorAdapter cursorAdapter = this.fcU;
        if (cursorAdapter instanceof SuggestionsAdapter) {
            ((SuggestionsAdapter) cursorAdapter).aYN(z2 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.Po6 = searchableInfo;
        if (searchableInfo != null) {
            piY();
            z();
        }
        boolean zV2 = v();
        this.qm = zV2;
        if (zV2) {
            this.f14304U.setPrivateImeOptions("nm");
        }
        eTf(bzg());
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.eWT = z2;
        eTf(bzg());
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter) {
        this.fcU = cursorAdapter;
        this.f14304U.setAdapter(cursorAdapter);
    }

    private Intent X(Intent intent, SearchableInfo searchableInfo) {
        String string;
        String string2;
        String string3;
        int voiceMaxResults;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.EWS;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            string = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            string = "free_form";
        }
        String strFlattenToShortString = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            string2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            string2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            string3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            string3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            voiceMaxResults = searchableInfo.getVoiceMaxResults();
        } else {
            voiceMaxResults = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        if (searchActivity != null) {
            strFlattenToShortString = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", strFlattenToShortString);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    static boolean Xw(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(androidx.appcompat.R.dimen.Uo);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(androidx.appcompat.R.dimen.KN);
    }

    private void ijL() {
        int i2;
        if (jB() && (this.f14297E.getVisibility() == 0 || this.f14298FX.getVisibility() == 0)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.p5.setVisibility(i2);
    }

    private void z() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f14304U;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(wTp(queryHint));
    }

    protected void M(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void a() {
        eTf(bzg());
        GR();
        if (this.f14304U.hasFocus()) {
            nHg();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        super.onLayout(z2, i2, i3, i5, i7);
        if (z2) {
            s7N(this.f14304U, this.f14296D);
            Rect rect = this.f14305a;
            Rect rect2 = this.f14296D;
            rect.set(rect2.left, 0, rect2.right, i7 - i3);
            UpdatableTouchDelegate updatableTouchDelegate = this.f14302J;
            if (updatableTouchDelegate == null) {
                UpdatableTouchDelegate updatableTouchDelegate2 = new UpdatableTouchDelegate(this.f14305a, this.f14296D, this.f14304U);
                this.f14302J = updatableTouchDelegate2;
                setTouchDelegate(updatableTouchDelegate2);
                return;
            }
            updatableTouchDelegate.n(this.f14305a, this.f14296D);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i5;
        if (bzg()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i5 = this.Rl) > 0) {
                    size = Math.min(i5, size);
                }
            } else {
                size = this.Rl;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i7 = this.Rl;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f14325O = bzg();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        GR();
    }
}
