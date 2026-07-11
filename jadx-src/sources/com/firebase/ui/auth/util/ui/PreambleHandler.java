package com.firebase.ui.auth.util.ui;

import W3.j;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import com.firebase.ui.auth.R$attr;
import com.firebase.ui.auth.R$color;
import com.firebase.ui.auth.R$string;
import com.firebase.ui.auth.data.model.FlowParameters;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class PreambleHandler {
    private SpannableStringBuilder mBuilder;
    private final int mButtonText;
    private final Context mContext;
    private final FlowParameters mFlowParameters;

    private static final class CustomTabsSpan extends URLSpan {
        private final WeakReference<Context> mContext;
        private final CustomTabsIntent mCustomTabsIntent;
        private final String mUrl;

        public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p0, Context p1, Uri p2) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
            if (p2 == null) {
                return;
            }
            p0.launchUrl(p1, p2);
        }

        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
        public void onClick(View view) {
            Context context = this.mContext.get();
            if (context != null) {
                safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(this.mCustomTabsIntent, context, Uri.parse(this.mUrl));
            }
        }

        public CustomTabsSpan(Context context, String str) {
            super(str);
            this.mContext = new WeakReference<>(context);
            this.mUrl = str;
            this.mCustomTabsIntent = new CustomTabsIntent.Builder().O(new CustomTabColorSchemeParams.Builder().rl(j.rl(context, R$attr.colorSurface, ContextCompat.getColor(context, R$color.design_default_color_primary))).n()).ty(true).n();
        }
    }

    public static void setup(Context context, FlowParameters flowParameters, @StringRes int i2, TextView textView) {
        setup(context, flowParameters, -1, i2, textView);
    }

    @Nullable
    private String getPreambleStringWithTargets(@StringRes int i2, boolean z2) {
        boolean zIsEmpty = TextUtils.isEmpty(this.mFlowParameters.termsOfServiceUrl);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.mFlowParameters.privacyPolicyUrl);
        if (zIsEmpty || zIsEmpty2) {
            return null;
        }
        return this.mContext.getString(i2, z2 ? new Object[]{"%BTN%", "%TOS%", "%PP%"} : new Object[]{"%TOS%", "%PP%"});
    }

    private void initPreamble(@StringRes int i2) {
        String preambleStringWithTargets = getPreambleStringWithTargets(i2, this.mButtonText != -1);
        if (preambleStringWithTargets == null) {
            return;
        }
        this.mBuilder = new SpannableStringBuilder(preambleStringWithTargets);
        replaceTarget("%BTN%", this.mButtonText);
        replaceUrlTarget("%TOS%", R$string.fui_terms_of_service, this.mFlowParameters.termsOfServiceUrl);
        replaceUrlTarget("%PP%", R$string.fui_privacy_policy, this.mFlowParameters.privacyPolicyUrl);
    }

    private void replaceTarget(String str, @StringRes int i2) {
        int iIndexOf = this.mBuilder.toString().indexOf(str);
        if (iIndexOf != -1) {
            this.mBuilder.replace(iIndexOf, str.length() + iIndexOf, (CharSequence) this.mContext.getString(i2));
        }
    }

    private void replaceUrlTarget(String str, @StringRes int i2, String str2) {
        int iIndexOf = this.mBuilder.toString().indexOf(str);
        if (iIndexOf != -1) {
            String string = this.mContext.getString(i2);
            this.mBuilder.replace(iIndexOf, str.length() + iIndexOf, (CharSequence) string);
            this.mBuilder.setSpan(new CustomTabsSpan(this.mContext, str2), iIndexOf, string.length() + iIndexOf, 0);
        }
    }

    public static void setup(Context context, FlowParameters flowParameters, @StringRes int i2, @StringRes int i3, TextView textView) {
        PreambleHandler preambleHandler = new PreambleHandler(context, flowParameters, i2);
        preambleHandler.initPreamble(i3);
        preambleHandler.setPreamble(textView);
    }

    private PreambleHandler(Context context, FlowParameters flowParameters, @StringRes int i2) {
        this.mContext = context;
        this.mFlowParameters = flowParameters;
        this.mButtonText = i2;
    }

    private void setPreamble(TextView textView) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(this.mBuilder);
    }
}
