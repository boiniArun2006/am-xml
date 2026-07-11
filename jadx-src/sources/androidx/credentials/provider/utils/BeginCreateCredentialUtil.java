package androidx.credentials.provider.utils;

import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.graphics.Trmy.yioUaKMByL;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialResponse;
import androidx.annotation.RequiresApi;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.BeginCreateCredentialRequest;
import androidx.credentials.provider.BeginCreateCustomCredentialRequest;
import androidx.credentials.provider.BeginCreatePasswordCredentialRequest;
import androidx.credentials.provider.BeginCreatePublicKeyCredentialRequest;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.CreateEntry;
import androidx.credentials.provider.RemoteEntry;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/utils/BeginCreateCredentialUtil;", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BeginCreateCredentialUtil {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/credentials/provider/utils/BeginCreateCredentialUtil$Companion;", "", "<init>", "()V", "Landroid/service/credentials/BeginCreateCredentialResponse$Builder;", "frameworkBuilder", "Landroidx/credentials/provider/RemoteEntry;", "remoteEntry", "", "qie", "(Landroid/service/credentials/BeginCreateCredentialResponse$Builder;Landroidx/credentials/provider/RemoteEntry;)V", "", "Landroidx/credentials/provider/CreateEntry;", "createEntries", "gh", "(Landroid/service/credentials/BeginCreateCredentialResponse$Builder;Ljava/util/List;)V", "Landroid/service/credentials/BeginCreateCredentialRequest;", AdActivity.REQUEST_KEY_EXTRA, "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "J2", "(Landroid/service/credentials/BeginCreateCredentialRequest;)Landroidx/credentials/provider/BeginCreateCredentialRequest;", "Landroidx/credentials/provider/BeginCreateCredentialResponse;", "response", "Landroid/service/credentials/BeginCreateCredentialResponse;", "O", "(Landroidx/credentials/provider/BeginCreateCredentialResponse;)Landroid/service/credentials/BeginCreateCredentialResponse;", "nr", "(Landroidx/credentials/provider/BeginCreateCredentialRequest;)Landroid/service/credentials/BeginCreateCredentialRequest;", "frameworkResponse", "Uo", "(Landroid/service/credentials/BeginCreateCredentialResponse;)Landroidx/credentials/provider/BeginCreateCredentialResponse;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBeginCreateCredentialUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginCreateCredentialUtil.kt\nandroidx/credentials/provider/utils/BeginCreateCredentialUtil$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1855#2,2:155\n1#3:157\n*S KotlinDebug\n*F\n+ 1 BeginCreateCredentialUtil.kt\nandroidx/credentials/provider/utils/BeginCreateCredentialUtil$Companion\n*L\n108#1:155,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CreateEntry KN(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (CreateEntry) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CreateEntry mUb(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (CreateEntry) tmp0.invoke(obj);
        }

        private final void qie(BeginCreateCredentialResponse.Builder frameworkBuilder, RemoteEntry remoteEntry) {
            if (remoteEntry == null) {
                return;
            }
            w6.n();
            frameworkBuilder.setRemoteCreateEntry(n.n(RemoteEntry.INSTANCE.rl(remoteEntry)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean xMQ(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        public final BeginCreateCredentialRequest J2(android.service.credentials.BeginCreateCredentialRequest request) {
            CallingAppInfo callingAppInfo;
            CallingAppInfo callingAppInfo2;
            CallingAppInfo callingAppInfo3;
            Intrinsics.checkNotNullParameter(request, "request");
            CallingAppInfo callingAppInfo4 = null;
            try {
                String type = request.getType();
                int iHashCode = type.hashCode();
                if (iHashCode != -543568185) {
                    if (iHashCode == -95037569 && type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        BeginCreatePublicKeyCredentialRequest.Companion companion = BeginCreatePublicKeyCredentialRequest.INSTANCE;
                        Bundle data = request.getData();
                        Intrinsics.checkNotNullExpressionValue(data, "request.data");
                        android.service.credentials.CallingAppInfo callingAppInfo5 = request.getCallingAppInfo();
                        if (callingAppInfo5 != null) {
                            String packageName = callingAppInfo5.getPackageName();
                            Intrinsics.checkNotNullExpressionValue(packageName, "it.packageName");
                            SigningInfo signingInfo = callingAppInfo5.getSigningInfo();
                            Intrinsics.checkNotNullExpressionValue(signingInfo, "it.signingInfo");
                            callingAppInfo3 = new CallingAppInfo(packageName, signingInfo, callingAppInfo5.getOrigin());
                        } else {
                            callingAppInfo3 = null;
                        }
                        return companion.n(data, callingAppInfo3);
                    }
                } else if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    BeginCreatePasswordCredentialRequest.Companion companion2 = BeginCreatePasswordCredentialRequest.INSTANCE;
                    Bundle data2 = request.getData();
                    Intrinsics.checkNotNullExpressionValue(data2, "request.data");
                    android.service.credentials.CallingAppInfo callingAppInfo6 = request.getCallingAppInfo();
                    if (callingAppInfo6 != null) {
                        String packageName2 = callingAppInfo6.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName2, "it.packageName");
                        SigningInfo signingInfo2 = callingAppInfo6.getSigningInfo();
                        Intrinsics.checkNotNullExpressionValue(signingInfo2, "it.signingInfo");
                        callingAppInfo = new CallingAppInfo(packageName2, signingInfo2, callingAppInfo6.getOrigin());
                    } else {
                        callingAppInfo = null;
                    }
                    return companion2.n(data2, callingAppInfo);
                }
                String type2 = request.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "request.type");
                Bundle data3 = request.getData();
                Intrinsics.checkNotNullExpressionValue(data3, "request.data");
                android.service.credentials.CallingAppInfo callingAppInfo7 = request.getCallingAppInfo();
                if (callingAppInfo7 != null) {
                    String packageName3 = callingAppInfo7.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName3, "it.packageName");
                    SigningInfo signingInfo3 = callingAppInfo7.getSigningInfo();
                    Intrinsics.checkNotNullExpressionValue(signingInfo3, "it.signingInfo");
                    callingAppInfo2 = new CallingAppInfo(packageName3, signingInfo3, callingAppInfo7.getOrigin());
                } else {
                    callingAppInfo2 = null;
                }
                return new BeginCreateCustomCredentialRequest(type2, data3, callingAppInfo2);
            } catch (FrameworkClassParsingException unused) {
                String type3 = request.getType();
                Intrinsics.checkNotNullExpressionValue(type3, "request.type");
                Bundle data4 = request.getData();
                Intrinsics.checkNotNullExpressionValue(data4, "request.data");
                android.service.credentials.CallingAppInfo callingAppInfo8 = request.getCallingAppInfo();
                if (callingAppInfo8 != null) {
                    String packageName4 = callingAppInfo8.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName4, "it.packageName");
                    SigningInfo signingInfo4 = callingAppInfo8.getSigningInfo();
                    Intrinsics.checkNotNullExpressionValue(signingInfo4, "it.signingInfo");
                    callingAppInfo4 = new CallingAppInfo(packageName4, signingInfo4, callingAppInfo8.getOrigin());
                }
                return new BeginCreateCustomCredentialRequest(type3, data4, callingAppInfo4);
            }
        }

        public final BeginCreateCredentialResponse O(androidx.credentials.provider.BeginCreateCredentialResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            BeginCreateCredentialResponse.Builder builderN = Dsr.n();
            gh(builderN, response.getCreateEntries());
            qie(builderN, response.getRemoteEntry());
            BeginCreateCredentialResponse beginCreateCredentialResponseBuild = builderN.build();
            Intrinsics.checkNotNullExpressionValue(beginCreateCredentialResponseBuild, "frameworkBuilder.build()");
            return beginCreateCredentialResponseBuild;
        }

        public final androidx.credentials.provider.BeginCreateCredentialResponse Uo(BeginCreateCredentialResponse frameworkResponse) {
            RemoteEntry remoteEntryN;
            Intrinsics.checkNotNullParameter(frameworkResponse, "frameworkResponse");
            Stream stream = frameworkResponse.getCreateEntries().stream();
            final BeginCreateCredentialUtil$Companion$convertToJetpackResponse$1 beginCreateCredentialUtil$Companion$convertToJetpackResponse$1 = new Function1<android.service.credentials.CreateEntry, CreateEntry>() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$convertToJetpackResponse$1
                public final CreateEntry n(android.service.credentials.CreateEntry createEntry) {
                    CreateEntry.Companion companion = CreateEntry.INSTANCE;
                    Slice slice = createEntry.getSlice();
                    Intrinsics.checkNotNullExpressionValue(slice, "entry.slice");
                    return companion.n(slice);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ CreateEntry invoke(android.service.credentials.CreateEntry createEntry) {
                    return n(r.n(createEntry));
                }
            };
            Stream map = stream.map(new Function() { // from class: androidx.credentials.provider.utils.s4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginCreateCredentialUtil.Companion.KN(beginCreateCredentialUtil$Companion$convertToJetpackResponse$1, obj);
                }
            });
            final BeginCreateCredentialUtil$Companion$convertToJetpackResponse$2 beginCreateCredentialUtil$Companion$convertToJetpackResponse$2 = new Function1<CreateEntry, Boolean>() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$convertToJetpackResponse$2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(CreateEntry createEntry) {
                    return Boolean.valueOf(createEntry != null);
                }
            };
            Stream streamFilter = map.filter(new Predicate() { // from class: androidx.credentials.provider.utils.UGc
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return BeginCreateCredentialUtil.Companion.xMQ(beginCreateCredentialUtil$Companion$convertToJetpackResponse$2, obj);
                }
            });
            final BeginCreateCredentialUtil$Companion$convertToJetpackResponse$3 beginCreateCredentialUtil$Companion$convertToJetpackResponse$3 = new Function1<CreateEntry, CreateEntry>() { // from class: androidx.credentials.provider.utils.BeginCreateCredentialUtil$Companion$convertToJetpackResponse$3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final CreateEntry invoke(CreateEntry createEntry) {
                    Intrinsics.checkNotNull(createEntry);
                    return createEntry;
                }
            };
            Object objCollect = streamFilter.map(new Function() { // from class: androidx.credentials.provider.utils.Q
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginCreateCredentialUtil.Companion.mUb(beginCreateCredentialUtil$Companion$convertToJetpackResponse$3, obj);
                }
            }).collect(Collectors.toList());
            Intrinsics.checkNotNullExpressionValue(objCollect, "frameworkResponse.create…lect(Collectors.toList())");
            List list = (List) objCollect;
            android.service.credentials.RemoteEntry remoteCreateEntry = frameworkResponse.getRemoteCreateEntry();
            if (remoteCreateEntry != null) {
                RemoteEntry.Companion companion = RemoteEntry.INSTANCE;
                Slice slice = remoteCreateEntry.getSlice();
                Intrinsics.checkNotNullExpressionValue(slice, "it.slice");
                remoteEntryN = companion.n(slice);
            } else {
                remoteEntryN = null;
            }
            return new androidx.credentials.provider.BeginCreateCredentialResponse(list, remoteEntryN);
        }

        public final android.service.credentials.BeginCreateCredentialRequest nr(BeginCreateCredentialRequest request) {
            android.service.credentials.CallingAppInfo callingAppInfoN;
            Intrinsics.checkNotNullParameter(request, yioUaKMByL.dbrrzaRX);
            if (request.getCallingAppInfo() != null) {
                Wre.n();
                callingAppInfoN = Ml.n(request.getCallingAppInfo().getPackageName(), request.getCallingAppInfo().getSigningInfo(), request.getCallingAppInfo().getOrigin());
            } else {
                callingAppInfoN = null;
            }
            CN3.n();
            return I28.n(request.getType(), request.getCandidateQueryData(), callingAppInfoN);
        }

        private final void gh(BeginCreateCredentialResponse.Builder frameworkBuilder, List createEntries) {
            Iterator it = createEntries.iterator();
            while (it.hasNext()) {
                Slice sliceRl = CreateEntry.INSTANCE.rl((CreateEntry) it.next());
                if (sliceRl != null) {
                    frameworkBuilder.addCreateEntry(fuX.n(sliceRl));
                }
            }
        }
    }
}
