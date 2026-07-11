package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ForwardingListener;
import androidx.appcompat.widget.TooltipCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class ActionMenuItemView extends AppCompatTextView implements MenuView.ItemView, View.OnClickListener, ActionMenuView.ActionMenuChildView {
    private CharSequence E2;
    private int M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ForwardingListener f13800N;
    private int P5;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    MenuBuilder.ItemInvoker f13801T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f13802U;
    private boolean Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f13803e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    MenuItemImpl f13804g;
    private boolean jB;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    PopupCallback f13805v;

    private class ActionMenuItemForwardingListener extends ForwardingListener {
        public ActionMenuItemForwardingListener() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public ShowableListMenu rl() {
            PopupCallback popupCallback = ActionMenuItemView.this.f13805v;
            if (popupCallback != null) {
                return popupCallback.n();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        protected boolean t() {
            ShowableListMenu showableListMenuRl;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            MenuBuilder.ItemInvoker itemInvoker = actionMenuItemView.f13801T;
            return itemInvoker != null && itemInvoker.nr(actionMenuItemView.f13804g) && (showableListMenuRl = rl()) != null && showableListMenuRl.n();
        }
    }

    public static abstract class PopupCallback {
        public abstract ShowableListMenu n();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean O() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.Xw = Z();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f13510S, i2, 0);
        this.f13802U = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.WPU, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.M7 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.P5 = -1;
        setSaveEnabled(false);
    }

    private void XQ() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.E2);
        if (this.f13803e != null && (!this.f13804g.te() || (!this.Xw && !this.jB))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.E2 : null);
        CharSequence contentDescription = this.f13804g.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z4 ? null : this.f13804g.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f13804g.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            TooltipCompat.n(this, z4 ? null : this.f13804g.getTitle());
        } else {
            TooltipCompat.n(this, tooltipText);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f13804g;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        MenuBuilder.ItemInvoker itemInvoker = this.f13801T;
        if (itemInvoker != null) {
            itemInvoker.nr(this.f13804g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener;
        if (this.f13804g.hasSubMenu() && (forwardingListener = this.f13800N) != null && forwardingListener.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z2) {
        if (this.jB != z2) {
            this.jB = z2;
            MenuItemImpl menuItemImpl = this.f13804g;
            if (menuItemImpl != null) {
                menuItemImpl.t();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f13803e = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.M7;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        XQ();
    }

    public void setItemInvoker(MenuBuilder.ItemInvoker itemInvoker) {
        this.f13801T = itemInvoker;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i5, int i7) {
        this.P5 = i2;
        super.setPadding(i2, i3, i5, i7);
    }

    public void setPopupCallback(PopupCallback popupCallback) {
        this.f13805v = popupCallback;
    }

    public void setTitle(CharSequence charSequence) {
        this.E2 = charSequence;
        XQ();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void t(MenuItemImpl menuItemImpl, int i2) {
        this.f13804g = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.xMQ(this));
        setId(menuItemImpl.getItemId());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setEnabled(menuItemImpl.isEnabled());
        if (menuItemImpl.hasSubMenu() && this.f13800N == null) {
            this.f13800N = new ActionMenuItemForwardingListener();
        }
    }

    private boolean Z() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (i2 < 480) {
            if ((i2 < 640 || i3 < 480) && configuration.orientation != 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean n() {
        return o();
    }

    public boolean o() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.Xw = Z();
        XQ();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        int iMin;
        int i5;
        boolean zO = o();
        if (zO && (i5 = this.P5) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(size, this.f13802U);
        } else {
            iMin = this.f13802U;
        }
        if (mode != 1073741824 && this.f13802U > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (!zO && this.f13803e != null) {
            super.setPadding((getMeasuredWidth() - this.f13803e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean rl() {
        if (o() && this.f13804g.getIcon() == null) {
            return true;
        }
        return false;
    }
}
