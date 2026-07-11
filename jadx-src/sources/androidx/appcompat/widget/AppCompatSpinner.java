package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.TintableBackgroundView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class AppCompatSpinner extends Spinner implements TintableBackgroundView {
    private static final int[] E2 = {R.attr.spinnerMode};
    private SpinnerAdapter J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ForwardingListener f14114O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f14115S;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Rect f14116g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AppCompatBackgroundHelper f14117n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SpinnerPopup f14118o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f14119r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f14120t;

    @VisibleForTesting
    class DialogPopup implements SpinnerPopup, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private CharSequence f14123O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        AlertDialog f14124n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ListAdapter f14125t;

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public Drawable J2() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int gh() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int rl() {
            return 0;
        }

        DialogPopup() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void HI(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void KN(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public CharSequence O() {
            return this.f14123O;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void Uo(CharSequence charSequence) {
            this.f14123O = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void dismiss() {
            AlertDialog alertDialog = this.f14124n;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f14124n = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void mUb(int i2, int i3) {
            if (this.f14125t == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f14123O;
            if (charSequence != null) {
                builder.setTitle(charSequence);
            }
            AlertDialog alertDialogCreate = builder.Ik(this.f14125t, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f14124n = alertDialogCreate;
            ListView listViewMUb = alertDialogCreate.mUb();
            listViewMUb.setTextDirection(i2);
            listViewMUb.setTextAlignment(i3);
            this.f14124n.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public boolean n() {
            AlertDialog alertDialog = this.f14124n;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void nr(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            AppCompatSpinner.this.setSelection(i2);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i2, this.f14125t.getItemId(i2));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void qie(ListAdapter listAdapter) {
            this.f14125t = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void xMQ(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    private static class DropDownAdapter implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private SpinnerAdapter f14126n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ListAdapter f14127t;

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f14127t;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f14126n;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f14126n;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f14126n;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f14126n;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f14126n;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f14127t;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f14126n;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f14126n;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }

        public DropDownAdapter(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f14126n = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f14127t = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter) {
                    Api23Impl.n((android.widget.ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }
    }

    @VisibleForTesting
    class DropdownPopup extends ListPopupWindow implements SpinnerPopup {
        private CharSequence dR0;
        private int ijL;
        private final Rect piY;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        ListAdapter f14129z;

        public DropdownPopup(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.piY = new Rect();
            iF(AppCompatSpinner.this);
            N(true);
            bzg(0);
            s7N(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView adapterView, View view, int i3, long j2) {
                    AppCompatSpinner.this.setSelection(i3);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        DropdownPopup dropdownPopup = DropdownPopup.this;
                        AppCompatSpinner.this.performItemClick(view, i3, dropdownPopup.f14129z.getItemId(i3));
                    }
                    DropdownPopup.this.dismiss();
                }
            });
        }

        public int M7() {
            return this.ijL;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public CharSequence O() {
            return this.dR0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void Uo(CharSequence charSequence) {
            this.dR0 = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void xMQ(int i2) {
            this.ijL = i2;
        }

        void P5() {
            int i2;
            int iM7;
            Drawable drawableJ2 = J2();
            if (drawableJ2 != null) {
                drawableJ2.getPadding(AppCompatSpinner.this.f14116g);
                if (ViewUtils.rl(AppCompatSpinner.this)) {
                    i2 = AppCompatSpinner.this.f14116g.right;
                } else {
                    i2 = -AppCompatSpinner.this.f14116g.left;
                }
            } else {
                Rect rect = AppCompatSpinner.this.f14116g;
                rect.right = 0;
                rect.left = 0;
                i2 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i3 = appCompatSpinner.f14115S;
            if (i3 == -2) {
                int iN = appCompatSpinner.n((SpinnerAdapter) this.f14129z, J2());
                int i5 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f14116g;
                int i7 = (i5 - rect2.left) - rect2.right;
                if (iN > i7) {
                    iN = i7;
                }
                E2(Math.max(iN, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                E2((width - paddingLeft) - paddingRight);
            } else {
                E2(i3);
            }
            if (ViewUtils.rl(AppCompatSpinner.this)) {
                iM7 = i2 + (((width - paddingRight) - ViF()) - M7());
            } else {
                iM7 = i2 + paddingLeft + M7();
            }
            nr(iM7);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void mUb(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean zN = n();
            P5();
            T(2);
            super.show();
            ListView listViewTy = ty();
            listViewTy.setChoiceMode(1);
            listViewTy.setTextDirection(i2);
            listViewTy.setTextAlignment(i3);
            Xw(AppCompatSpinner.this.getSelectedItemPosition());
            if (!zN && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.2
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        DropdownPopup dropdownPopup = DropdownPopup.this;
                        if (!dropdownPopup.p5(AppCompatSpinner.this)) {
                            DropdownPopup.this.dismiss();
                        } else {
                            DropdownPopup.this.P5();
                            DropdownPopup.super.show();
                        }
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                nHg(new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.3
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public void onDismiss() {
                        ViewTreeObserver viewTreeObserver2 = AppCompatSpinner.this.getViewTreeObserver();
                        if (viewTreeObserver2 != null) {
                            viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                        }
                    }
                });
            }
        }

        boolean p5(View view) {
            if (view.isAttachedToWindow() && view.getGlobalVisibleRect(this.piY)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void qie(ListAdapter listAdapter) {
            super.qie(listAdapter);
            this.f14129z = listAdapter;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f14135n;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f14136t;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.rl = propertyMapper.mapObject("backgroundTint", androidx.appcompat.R.attr.f13427S);
            this.f14136t = propertyMapper.mapObject("backgroundTintMode", androidx.appcompat.R.attr.WPU);
            this.f14135n = true;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void readProperties(AppCompatSpinner appCompatSpinner, PropertyReader propertyReader) {
            if (!this.f14135n) {
                throw w6.n();
            }
            propertyReader.readObject(this.rl, appCompatSpinner.getBackgroundTintList());
            propertyReader.readObject(this.f14136t, appCompatSpinner.getBackgroundTintMode());
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.appcompat.widget.AppCompatSpinner.SavedState.1
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
        boolean f14137n;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f14137n = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f14137n ? (byte) 1 : (byte) 0);
        }
    }

    @VisibleForTesting
    interface SpinnerPopup {
        void HI(Drawable drawable);

        Drawable J2();

        void KN(int i2);

        CharSequence O();

        void Uo(CharSequence charSequence);

        void dismiss();

        int gh();

        void mUb(int i2, int i3);

        boolean n();

        void nr(int i2);

        void qie(ListAdapter listAdapter);

        int rl();

        void xMQ(int i2);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.Mx);
    }

    int n(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f14116g);
        Rect rect = this.f14116g;
        return iMax2 + rect.left + rect.right;
    }

    @RequiresApi
    private static final class Api23Impl {
        @DoNotInline
        static void n(@NonNull android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, @Nullable Resources.Theme theme) {
            if (!ObjectsCompat.n(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        SpinnerPopup spinnerPopup = this.f14118o;
        return spinnerPopup != null ? spinnerPopup.rl() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        SpinnerPopup spinnerPopup = this.f14118o;
        return spinnerPopup != null ? spinnerPopup.gh() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f14118o != null ? this.f14115S : super.getDropDownWidth();
    }

    @VisibleForTesting
    final SpinnerPopup getInternalPopup() {
        return this.f14118o;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        SpinnerPopup spinnerPopup = this.f14118o;
        return spinnerPopup != null ? spinnerPopup.J2() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f14120t;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        SpinnerPopup spinnerPopup = this.f14118o;
        return spinnerPopup != null ? spinnerPopup.O() : super.getPrompt();
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14117n;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.t();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14117n;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.nr();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f14137n || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.AppCompatSpinner.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (!AppCompatSpinner.this.getInternalPopup().n()) {
                    AppCompatSpinner.this.rl();
                }
                ViewTreeObserver viewTreeObserver2 = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SpinnerPopup spinnerPopup = this.f14118o;
        savedState.f14137n = spinnerPopup != null && spinnerPopup.n();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener = this.f14114O;
        if (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        SpinnerPopup spinnerPopup = this.f14118o;
        if (spinnerPopup == null) {
            return super.performClick();
        }
        if (spinnerPopup.n()) {
            return true;
        }
        rl();
        return true;
    }

    void rl() {
        this.f14118o.mUb(getTextDirection(), getTextAlignment());
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f14119r) {
            this.J2 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f14118o != null) {
            Context context = this.f14120t;
            if (context == null) {
                context = getContext();
            }
            this.f14118o.qie(new DropDownAdapter(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        SpinnerPopup spinnerPopup = this.f14118o;
        if (spinnerPopup == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            spinnerPopup.xMQ(i2);
            this.f14118o.nr(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        SpinnerPopup spinnerPopup = this.f14118o;
        if (spinnerPopup != null) {
            spinnerPopup.KN(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f14118o != null) {
            this.f14115S = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        SpinnerPopup spinnerPopup = this.f14118o;
        if (spinnerPopup != null) {
            spinnerPopup.HI(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        SpinnerPopup spinnerPopup = this.f14118o;
        if (spinnerPopup != null) {
            spinnerPopup.Uo(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14117n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.xMQ(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14117n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.mUb(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14117n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.rl();
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpinnerPopup spinnerPopup = this.f14118o;
        if (spinnerPopup != null && spinnerPopup.n()) {
            this.f14118o.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f14118o != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), n(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14117n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.J2(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14117n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Uo(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int i2) {
        setPopupBackgroundDrawable(AppCompatResources.rl(getPopupContext(), i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i2, int i3, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrIk;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i2);
        this.f14116g = new Rect();
        ThemeUtils.n(this, getContext());
        TintTypedArray tintTypedArrayS = TintTypedArray.S(context, attributeSet, androidx.appcompat.R.styleable.q9, i2, 0);
        this.f14117n = new AppCompatBackgroundHelper(this);
        if (theme != null) {
            this.f14120t = new ContextThemeWrapper(context, theme);
        } else {
            int iTy = tintTypedArrayS.ty(androidx.appcompat.R.styleable.f13520d, 0);
            if (iTy != 0) {
                this.f14120t = new ContextThemeWrapper(context, iTy);
            } else {
                this.f14120t = context;
            }
        }
        ?? r11 = -1;
        ?? r2 = 0;
        try {
            if (i3 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E2, i2, 0);
                    try {
                        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                        r11 = typedArrayObtainStyledAttributes;
                        if (zHasValue) {
                            i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
                            r11 = typedArrayObtainStyledAttributes;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        r11 = typedArrayObtainStyledAttributes;
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i3 != 0) {
                        }
                        charSequenceArrIk = tintTypedArrayS.Ik(androidx.appcompat.R.styleable.f13490A);
                        if (charSequenceArrIk != null) {
                        }
                        tintTypedArrayS.aYN();
                        this.f14119r = true;
                        spinnerAdapter = this.J2;
                        if (spinnerAdapter != null) {
                        }
                        this.f14117n.O(attributeSet, i2);
                    }
                } catch (Exception e3) {
                    e = e3;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th) {
                    th = th;
                    if (r2 != 0) {
                        r2.recycle();
                    }
                    throw th;
                }
                r11.recycle();
            }
            if (i3 != 0) {
                DialogPopup dialogPopup = new DialogPopup();
                this.f14118o = dialogPopup;
                dialogPopup.Uo(tintTypedArrayS.HI(androidx.appcompat.R.styleable.oz));
            } else if (i3 == 1) {
                final DropdownPopup dropdownPopup = new DropdownPopup(this.f14120t, attributeSet, i2);
                TintTypedArray tintTypedArrayS2 = TintTypedArray.S(this.f14120t, attributeSet, androidx.appcompat.R.styleable.q9, i2, 0);
                this.f14115S = tintTypedArrayS2.az(androidx.appcompat.R.styleable.qva, -2);
                dropdownPopup.HI(tintTypedArrayS2.Uo(androidx.appcompat.R.styleable.WH));
                dropdownPopup.Uo(tintTypedArrayS.HI(androidx.appcompat.R.styleable.oz));
                tintTypedArrayS2.aYN();
                this.f14118o = dropdownPopup;
                this.f14114O = new ForwardingListener(this) { // from class: androidx.appcompat.widget.AppCompatSpinner.1
                    @Override // androidx.appcompat.widget.ForwardingListener
                    public ShowableListMenu rl() {
                        return dropdownPopup;
                    }

                    @Override // androidx.appcompat.widget.ForwardingListener
                    public boolean t() {
                        if (AppCompatSpinner.this.getInternalPopup().n()) {
                            return true;
                        }
                        AppCompatSpinner.this.rl();
                        return true;
                    }
                };
            }
            charSequenceArrIk = tintTypedArrayS.Ik(androidx.appcompat.R.styleable.f13490A);
            if (charSequenceArrIk != null) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrIk);
                arrayAdapter.setDropDownViewResource(androidx.appcompat.R.layout.f13480Z);
                setAdapter(arrayAdapter);
            }
            tintTypedArrayS.aYN();
            this.f14119r = true;
            spinnerAdapter = this.J2;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.J2 = null;
            }
            this.f14117n.O(attributeSet, i2);
        } catch (Throwable th2) {
            th = th2;
            r2 = r11;
        }
    }
}
