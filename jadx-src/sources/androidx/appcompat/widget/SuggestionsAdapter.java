package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class SuggestionsAdapter extends ResourceCursorAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f14337B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f14338E;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private int f14339FX;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f14340M;
    private ColorStateList M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final SearchableInfo f14341N;
    private int P5;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final SearchView f14342T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f14343U;
    private final WeakHashMap Xw;
    private int eF;
    private final int jB;
    private int p5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Context f14344v;

    private static String WPU(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    private Drawable o(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i2 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f14344v.getPackageName() + "/" + i2;
            Drawable drawableGh = gh(str2);
            if (drawableGh != null) {
                return drawableGh;
            }
            Drawable drawable = ContextCompat.getDrawable(this.f14344v, i2);
            g(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableGh2 = gh(str);
            if (drawableGh2 != null) {
                return drawableGh2;
            }
            Drawable drawableIk = Ik(Uri.parse(str));
            g(str, drawableIk);
            return drawableIk;
        }
    }

    Cursor S(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i2 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.f14344v.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public CharSequence n(Cursor cursor) {
        String strHI;
        String strHI2;
        if (cursor == null) {
            return null;
        }
        String strHI3 = HI(cursor, "suggest_intent_query");
        if (strHI3 != null) {
            return strHI3;
        }
        if (this.f14341N.shouldRewriteQueryFromData() && (strHI2 = HI(cursor, "suggest_intent_data")) != null) {
            return strHI2;
        }
        if (!this.f14341N.shouldRewriteQueryFromText() || (strHI = HI(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strHI;
    }

    private static final class ChildViewCache {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final ImageView f14345O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final TextView f14346n;
        public final ImageView nr;
        public final TextView rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final ImageView f14347t;

        public ChildViewCache(View view) {
            this.f14346n = (TextView) view.findViewById(R.id.text1);
            this.rl = (TextView) view.findViewById(R.id.text2);
            this.f14347t = (ImageView) view.findViewById(R.id.icon1);
            this.nr = (ImageView) view.findViewById(R.id.icon2);
            this.f14345O = (ImageView) view.findViewById(androidx.appcompat.R.id.f13475o);
        }
    }

    private Drawable Ik(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f14344v.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    return drawableCreateFromStream;
                } catch (IOException e2) {
                    return drawableCreateFromStream;
                }
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e22) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e22);
                }
            }
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
        return null;
    }

    private Drawable XQ(Cursor cursor) {
        int i2 = this.f14339FX;
        if (i2 == -1) {
            return null;
        }
        return o(cursor.getString(i2));
    }

    private Drawable Z(Cursor cursor) {
        int i2 = this.f14340M;
        if (i2 == -1) {
            return null;
        }
        Drawable drawableO = o(cursor.getString(i2));
        return drawableO != null ? drawableO : ck();
    }

    private Drawable az(ComponentName componentName) {
        PackageManager packageManager = this.f14344v.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("SuggestionsAdapter", e2.toString());
            return null;
        }
    }

    private Drawable ck() {
        Drawable drawableTy = ty(this.f14341N.getSearchActivity());
        return drawableTy != null ? drawableTy : this.f14344v.getPackageManager().getDefaultActivityIcon();
    }

    private void g(String str, Drawable drawable) {
        if (drawable != null) {
            this.Xw.put(str, drawable.getConstantState());
        }
    }

    private Drawable gh(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.Xw.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence qie(CharSequence charSequence) {
        if (this.M7 == null) {
            TypedValue typedValue = new TypedValue();
            this.f14344v.getTheme().resolveAttribute(androidx.appcompat.R.attr.Jk, typedValue, true);
            this.M7 = this.f14344v.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.M7, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private void te(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void aYN(int i2) {
        this.P5 = i2;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public void rl(Cursor cursor) {
        if (this.f14343U) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.rl(cursor);
            if (cursor != null) {
                this.p5 = cursor.getColumnIndex("suggest_text_1");
                this.eF = cursor.getColumnIndex("suggest_text_2");
                this.f14338E = cursor.getColumnIndex("suggest_text_2_url");
                this.f14340M = cursor.getColumnIndex("suggest_icon_1");
                this.f14339FX = cursor.getColumnIndex("suggest_icon_2");
                this.f14337B = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public Cursor t(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f14342T.getVisibility() == 0 && this.f14342T.getWindowVisibility() == 0) {
            try {
                Cursor cursorS = S(this.f14341N, string, 50);
                if (cursorS != null) {
                    cursorS.getCount();
                    return cursorS;
                }
            } catch (RuntimeException e2) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            }
        }
        return null;
    }

    public SuggestionsAdapter(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f14343U = false;
        this.P5 = 1;
        this.p5 = -1;
        this.eF = -1;
        this.f14338E = -1;
        this.f14340M = -1;
        this.f14339FX = -1;
        this.f14337B = -1;
        this.f14342T = searchView;
        this.f14341N = searchableInfo;
        this.jB = searchView.getSuggestionCommitIconResId();
        this.f14344v = context;
        this.Xw = weakHashMap;
    }

    public static String HI(Cursor cursor, String str) {
        return WPU(cursor, cursor.getColumnIndex(str));
    }

    private void ViF(ImageView imageView, Drawable drawable, int i2) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i2);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void nY(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private Drawable ty(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.Xw.containsKey(strFlattenToShortString)) {
            Drawable.ConstantState constantState2 = (Drawable.ConstantState) this.Xw.get(strFlattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f14344v.getResources());
        }
        Drawable drawableAz = az(componentName);
        if (drawableAz != null) {
            constantState = drawableAz.getConstantState();
        }
        this.Xw.put(strFlattenToShortString, constantState);
        return drawableAz;
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public View KN(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewKN = super.KN(context, cursor, viewGroup);
        viewKN.setTag(new ChildViewCache(viewKN));
        ((ImageView) viewKN.findViewById(androidx.appcompat.R.id.f13475o)).setImageResource(this.jB);
        return viewKN;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void O(View view, Context context, Cursor cursor) {
        int i2;
        CharSequence charSequenceWPU;
        ChildViewCache childViewCache = (ChildViewCache) view.getTag();
        int i3 = this.f14337B;
        if (i3 != -1) {
            i2 = cursor.getInt(i3);
        } else {
            i2 = 0;
        }
        if (childViewCache.f14346n != null) {
            nY(childViewCache.f14346n, WPU(cursor, this.p5));
        }
        if (childViewCache.rl != null) {
            String strWPU = WPU(cursor, this.f14338E);
            if (strWPU != null) {
                charSequenceWPU = qie(strWPU);
            } else {
                charSequenceWPU = WPU(cursor, this.eF);
            }
            if (TextUtils.isEmpty(charSequenceWPU)) {
                TextView textView = childViewCache.f14346n;
                if (textView != null) {
                    textView.setSingleLine(false);
                    childViewCache.f14346n.setMaxLines(2);
                }
            } else {
                TextView textView2 = childViewCache.f14346n;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    childViewCache.f14346n.setMaxLines(1);
                }
            }
            nY(childViewCache.rl, charSequenceWPU);
        }
        ImageView imageView = childViewCache.f14347t;
        if (imageView != null) {
            ViF(imageView, Z(cursor), 4);
        }
        ImageView imageView2 = childViewCache.nr;
        if (imageView2 != null) {
            ViF(imageView2, XQ(cursor), 8);
        }
        int i5 = this.P5;
        if (i5 != 2 && (i5 != 1 || (i2 & 1) == 0)) {
            childViewCache.f14345O.setVisibility(8);
            return;
        }
        childViewCache.f14345O.setVisibility(0);
        childViewCache.f14345O.setTag(childViewCache.f14346n.getText());
        childViewCache.f14345O.setOnClickListener(this);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewUo = Uo(this.f14344v, nr(), viewGroup);
            if (viewUo != null) {
                ((ChildViewCache) viewUo.getTag()).f14346n.setText(e2.toString());
            }
            return viewUo;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewKN = KN(this.f14344v, nr(), viewGroup);
            if (viewKN != null) {
                ((ChildViewCache) viewKN.getTag()).f14346n.setText(e2.toString());
            }
            return viewKN;
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        te(nr());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        te(nr());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f14342T.M((CharSequence) tag);
        }
    }

    Drawable r(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f14344v.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            identifier = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (identifier != 0) {
                        return resourcesForApplication.getDrawable(identifier);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }
}
