package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class SupportMenuInflater extends MenuInflater {
    static final Class[] J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    static final Class[] f13773O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Object[] f13774n;
    private Object nr;
    final Object[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Context f13775t;

    private static class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final Class[] f13776O = {MenuItem.class};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Object f13777n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Method f13778t;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f13778t.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f13778t.invoke(this.f13777n, menuItem)).booleanValue();
                }
                this.f13778t.invoke(this.f13777n, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }

        public InflatedOnMenuItemClickListener(Object obj, String str) {
            this.f13777n = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f13778t = cls.getMethod(str, f13776O);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
    }

    private class MenuState {
        private int HI;
        private int Ik;
        private boolean J2;
        private boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f13779O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private int f13780S;
        private boolean Uo;
        private String ViF;
        private int WPU;
        private boolean XQ;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private boolean f13781Z;
        private String aYN;
        private int az;
        private char ck;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ActionProvider f13783g;
        private CharSequence gh;
        private CharSequence iF;
        private int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Menu f13784n;
        private String nY;
        private int nr;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f13785o;
        private CharSequence qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f13786r;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f13787t;
        private CharSequence te;
        private char ty;
        private int xMQ;
        private ColorStateList fD = null;
        private PorterDuff.Mode E2 = null;

        private char t(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public void KN() {
            this.rl = 0;
            this.f13787t = 0;
            this.nr = 0;
            this.f13779O = 0;
            this.J2 = true;
            this.Uo = true;
        }

        public void n() {
            this.KN = true;
            xMQ(this.f13784n.add(this.rl, this.xMQ, this.mUb, this.gh));
        }

        public SubMenu rl() {
            this.KN = true;
            SubMenu subMenuAddSubMenu = this.f13784n.addSubMenu(this.rl, this.xMQ, this.mUb, this.gh);
            xMQ(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public MenuState(Menu menu) {
            this.f13784n = menu;
            KN();
        }

        private Object O(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, SupportMenuInflater.this.f13775t.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        private void xMQ(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.f13785o).setVisible(this.f13781Z).setEnabled(this.XQ).setCheckable(this.f13786r >= 1).setTitleCondensed(this.qie).setIcon(this.az);
            int i2 = this.f13780S;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.nY != null) {
                if (SupportMenuInflater.this.f13775t.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new InflatedOnMenuItemClickListener(SupportMenuInflater.this.rl(), this.nY));
            }
            if (this.f13786r >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).Z(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).KN(true);
                }
            }
            String str = this.aYN;
            if (str != null) {
                menuItem.setActionView((View) O(str, SupportMenuInflater.f13773O, SupportMenuInflater.this.f13774n));
                z2 = true;
            }
            int i3 = this.WPU;
            if (i3 > 0) {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            ActionProvider actionProvider = this.f13783g;
            if (actionProvider != null) {
                MenuItemCompat.n(menuItem, actionProvider);
            }
            MenuItemCompat.t(menuItem, this.te);
            MenuItemCompat.Uo(menuItem, this.iF);
            MenuItemCompat.rl(menuItem, this.ty, this.HI);
            MenuItemCompat.J2(menuItem, this.ck, this.Ik);
            PorterDuff.Mode mode = this.E2;
            if (mode != null) {
                MenuItemCompat.O(menuItem, mode);
            }
            ColorStateList colorStateList = this.fD;
            if (colorStateList != null) {
                MenuItemCompat.nr(menuItem, colorStateList);
            }
        }

        public void J2(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = SupportMenuInflater.this.f13775t.obtainStyledAttributes(attributeSet, R.styleable.nO);
            this.rl = typedArrayObtainStyledAttributes.getResourceId(R.styleable.v0j, 0);
            this.f13787t = typedArrayObtainStyledAttributes.getInt(R.styleable.n7b, 0);
            this.nr = typedArrayObtainStyledAttributes.getInt(R.styleable.Aum, 0);
            this.f13779O = typedArrayObtainStyledAttributes.getInt(R.styleable.f13534s, 0);
            this.J2 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.o9, true);
            this.Uo = typedArrayObtainStyledAttributes.getBoolean(R.styleable.vl, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void Uo(AttributeSet attributeSet) {
            TintTypedArray tintTypedArrayXQ = TintTypedArray.XQ(SupportMenuInflater.this.f13775t, attributeSet, R.styleable.Lp6);
            this.xMQ = tintTypedArrayXQ.ty(R.styleable.jO, 0);
            this.mUb = (tintTypedArrayXQ.gh(R.styleable.Th, this.f13787t) & (-65536)) | (tintTypedArrayXQ.gh(R.styleable.xzo, this.nr) & 65535);
            this.gh = tintTypedArrayXQ.ck(R.styleable.XNZ);
            this.qie = tintTypedArrayXQ.ck(R.styleable.lNy);
            this.az = tintTypedArrayXQ.ty(R.styleable.g6, 0);
            this.ty = t(tintTypedArrayXQ.HI(R.styleable.I9f));
            this.HI = tintTypedArrayXQ.gh(R.styleable.LPV, 4096);
            this.ck = t(tintTypedArrayXQ.HI(R.styleable.D76));
            this.Ik = tintTypedArrayXQ.gh(R.styleable.SR, 4096);
            int i2 = R.styleable.f13507NP;
            if (tintTypedArrayXQ.o(i2)) {
                this.f13786r = tintTypedArrayXQ.n(i2, false) ? 1 : 0;
            } else {
                this.f13786r = this.f13779O;
            }
            this.f13785o = tintTypedArrayXQ.n(R.styleable.Toy, false);
            this.f13781Z = tintTypedArrayXQ.n(R.styleable.wKp, this.J2);
            this.XQ = tintTypedArrayXQ.n(R.styleable.Mh, this.Uo);
            this.f13780S = tintTypedArrayXQ.gh(R.styleable.EN, -1);
            this.nY = tintTypedArrayXQ.HI(R.styleable.QgZ);
            this.WPU = tintTypedArrayXQ.ty(R.styleable.f13527j, 0);
            this.aYN = tintTypedArrayXQ.HI(R.styleable.waP);
            String strHI = tintTypedArrayXQ.HI(R.styleable.f13500H);
            this.ViF = strHI;
            boolean z2 = strHI != null;
            if (z2 && this.WPU == 0 && this.aYN == null) {
                this.f13783g = (ActionProvider) O(strHI, SupportMenuInflater.J2, SupportMenuInflater.this.rl);
            } else {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f13783g = null;
            }
            this.te = tintTypedArrayXQ.ck(R.styleable.rxp);
            this.iF = tintTypedArrayXQ.ck(R.styleable.pS);
            int i3 = R.styleable.Ro;
            if (tintTypedArrayXQ.o(i3)) {
                this.E2 = DrawableUtils.O(tintTypedArrayXQ.gh(i3, -1), this.E2);
            } else {
                this.E2 = null;
            }
            int i5 = R.styleable.Fp;
            if (tintTypedArrayXQ.o(i5)) {
                this.fD = tintTypedArrayXQ.t(i5);
            } else {
                this.fD = null;
            }
            tintTypedArrayXQ.aYN();
            this.KN = false;
        }

        public boolean nr() {
            return this.KN;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f13773O = clsArr;
        J2 = clsArr;
    }

    private Object n(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? n(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void t(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        MenuState menuState = new MenuState(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z3 && name2.equals(str)) {
                        z3 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        menuState.KN();
                    } else if (name2.equals("item")) {
                        if (!menuState.nr()) {
                            ActionProvider actionProvider = menuState.f13783g;
                            if (actionProvider == null || !actionProvider.n()) {
                                menuState.n();
                            } else {
                                menuState.rl();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z2 = true;
                    }
                }
            } else if (!z3) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    menuState.J2(attributeSet);
                } else if (name3.equals("item")) {
                    menuState.Uo(attributeSet);
                } else if (name3.equals("menu")) {
                    t(xmlPullParser, attributeSet, menuState.rl());
                } else {
                    str = name3;
                    z3 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z2 = false;
        try {
            try {
                layout = this.f13775t.getResources().getLayout(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuBuilder) {
                    MenuBuilder menuBuilder = (MenuBuilder) menu;
                    if (menuBuilder.T()) {
                        menuBuilder.dR0();
                        z2 = true;
                    }
                }
                t(layout, attributeSetAsAttributeSet, menu);
                if (z2) {
                    ((MenuBuilder) menu).k();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z2) {
                ((MenuBuilder) menu).k();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    Object rl() {
        if (this.nr == null) {
            this.nr = n(this.f13775t);
        }
        return this.nr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.f13775t = context;
        Object[] objArr = {context};
        this.f13774n = objArr;
        this.rl = objArr;
    }
}
