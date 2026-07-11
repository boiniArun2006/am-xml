package androidx.view;

import ILs.j;
import TFv.Lu;
import TFv.SPz;
import TFv.Wre;
import TFv.fuX;
import TFv.nKK;
import TFv.r;
import TFv.rv6;
import YgZ.uQga.IYJfqUyym;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import androidx.core.app.TaskStackBuilder;
import androidx.view.Lifecycle;
import androidx.view.LifecycleEventObserver;
import androidx.view.LifecycleObserver;
import androidx.view.LifecycleOwner;
import androidx.view.NavBackStackEntry;
import androidx.view.NavControllerViewModel;
import androidx.view.NavDestination;
import androidx.view.NavOptions;
import androidx.view.Navigator;
import androidx.view.OnBackPressedCallback;
import androidx.view.ViewModelStore;
import androidx.view.serialization.RouteSerializerKt;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0016\u0018\u0000 %2\u00020\u0001:\u0006\u0089\u0002\u008a\u0002\u008b\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJb\u0010\u0019\u001a\u00020\t*\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJP\u0010\u001e\u001a\u00020\t*\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t0\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010#\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b#\u0010$J3\u0010'\u001a\u00020\u001c\"\b\b\u0000\u0010%*\u00020\u00012\u0006\u0010&\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+J9\u0010.\u001a\u00020\u001c2\u0010\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000e2\u0006\u0010-\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b.\u0010/J1\u00103\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0002¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001cH\u0002¢\u0006\u0004\b7\u00108J\u0019\u0010;\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u000109H\u0003¢\u0006\u0004\b;\u0010<J\u0019\u0010?\u001a\u0004\u0018\u00010)2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u0019\u0010B\u001a\u00020A*\b\u0012\u0004\u0012\u00020\u000600H\u0002¢\u0006\u0004\bB\u0010CJ!\u0010D\u001a\u00020)\"\b\b\u0000\u0010%*\u00020\u00012\u0006\u0010&\u001a\u00028\u0000H\u0002¢\u0006\u0004\bD\u0010EJ5\u0010H\u001a\u00020\t2\u0006\u0010F\u001a\u00020\r2\b\u0010G\u001a\u0004\u0018\u0001092\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\bH\u0010IJ!\u0010J\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020\r2\b\u0010G\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\bJ\u0010KJ5\u0010M\u001a\u00020\u001c2\u0006\u0010L\u001a\u00020 2\b\u0010G\u001a\u0004\u0018\u0001092\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bM\u0010NJ;\u0010O\u001a\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010G\u001a\u0004\u0018\u0001092\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bO\u0010PJ%\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u000e\u0010Q\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100H\u0002¢\u0006\u0004\bR\u0010SJ9\u0010V\u001a\u00020\t2\u0006\u0010F\u001a\u00020\r2\b\u0010T\u001a\u0004\u0018\u0001092\u0006\u0010\u0017\u001a\u00020\u00062\u000e\b\u0002\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\tH\u0002¢\u0006\u0004\bX\u0010YJ\u0019\u0010Z\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\\\u00108J!\u0010]\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001cH\u0017¢\u0006\u0004\b]\u0010^J)\u0010_\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b_\u0010$J)\u0010`\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020)2\u0006\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b`\u0010+J%\u0010c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00062\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\t0aH\u0000¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\tH\u0000¢\u0006\u0004\be\u0010YJ\u0015\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0000¢\u0006\u0004\bf\u0010gJ\u0019\u0010i\u001a\u00020\t2\b\b\u0001\u0010h\u001a\u00020 H\u0017¢\u0006\u0004\bi\u0010jJ#\u0010k\u001a\u00020\t2\b\b\u0001\u0010h\u001a\u00020 2\b\u0010:\u001a\u0004\u0018\u000109H\u0017¢\u0006\u0004\bk\u0010lJ!\u0010n\u001a\u00020\t2\u0006\u0010m\u001a\u00020A2\b\u0010:\u001a\u0004\u0018\u000109H\u0017¢\u0006\u0004\bn\u0010oJ\u0019\u0010r\u001a\u00020\u001c2\b\u0010q\u001a\u0004\u0018\u00010pH\u0017¢\u0006\u0004\br\u0010sJ'\u0010u\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010!\u001a\u00020 2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bu\u0010vJ3\u0010x\u001a\u0004\u0018\u00010\r*\u00020\r2\b\b\u0001\u0010!\u001a\u00020 2\u0006\u0010w\u001a\u00020\u001c2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bx\u0010yJ#\u0010{\u001a\u00020\t2\b\b\u0001\u0010z\u001a\u00020 2\b\u0010G\u001a\u0004\u0018\u000109H\u0017¢\u0006\u0004\b{\u0010lJ-\u0010|\u001a\u00020\t2\b\b\u0001\u0010z\u001a\u00020 2\b\u0010G\u001a\u0004\u0018\u0001092\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b|\u0010}J7\u0010~\u001a\u00020\t2\b\b\u0001\u0010z\u001a\u00020 2\b\u0010G\u001a\u0004\u0018\u0001092\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b~\u0010\u007fJ\u0014\u0010\u0080\u0001\u001a\u0004\u0018\u000109H\u0017¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001c\u0010\u0083\u0001\u001a\u00020\t2\t\u0010\u0082\u0001\u001a\u0004\u0018\u000109H\u0017¢\u0006\u0005\b\u0083\u0001\u0010<J\u001c\u0010\u0086\u0001\u001a\u00020\t2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0017¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u008a\u0001\u001a\u00020\t2\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0017¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001c\u0010\u008c\u0001\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020 H\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0018\u0010\u008e\u0001\u001a\u00020\u00062\u0006\u0010&\u001a\u00020)¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009e\u0001\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R#\u0010¦\u0001\u001a\f\u0012\u0005\u0012\u00030£\u0001\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010¨\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b§\u0001\u0010.R\u001d\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R$\u0010¯\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R,\u0010µ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0°\u00018GX\u0087\u0004¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R$\u0010·\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010®\u0001R)\u0010º\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0°\u00018\u0006¢\u0006\u0010\n\u0006\b¸\u0001\u0010²\u0001\u001a\u0006\b¹\u0001\u0010´\u0001R$\u0010¾\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R%\u0010Á\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030¿\u00010»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010½\u0001R&\u0010Ã\u0001\u001a\u0011\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010)0»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010½\u0001R)\u0010Ä\u0001\u001a\u0015\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u000201000»\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bV\u0010½\u0001R\u001c\u0010Ç\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u001b\u0010Ê\u0001\u001a\u0005\u0018\u00010È\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b5\u0010É\u0001R\u001e\u0010Î\u0001\u001a\n\u0012\u0005\u0012\u00030Ì\u00010Ë\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010Í\u0001R)\u0010Õ\u0001\u001a\u00030Ï\u00018@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b.\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001R\u0017\u0010Ø\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bO\u0010×\u0001R\u0017\u0010Û\u0001\u001a\u00030Ù\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bu\u0010Ú\u0001R\u0018\u0010Ý\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÜ\u0001\u0010.R\u0019\u0010à\u0001\u001a\u00030Þ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bx\u0010ß\u0001R1\u0010ã\u0001\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\u0012\t\u0012\u00070á\u0001R\u00020\u00000»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010½\u0001R5\u0010å\u0001\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b?\u0010ä\u0001R5\u0010æ\u0001\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bD\u0010ä\u0001R$\u0010ç\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001c0»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010½\u0001R\u0018\u0010è\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010cR\u001e\u0010ë\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060é\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010ê\u0001R!\u0010ð\u0001\u001a\u00030\u0098\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001R\u001e\u0010ô\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R#\u0010ú\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060õ\u00018\u0006¢\u0006\u0010\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001R\u0017\u0010ü\u0001\u001a\u00020 8BX\u0082\u0004¢\u0006\b\u001a\u0006\bö\u0001\u0010û\u0001R'\u0010m\u001a\u00020A2\u0006\u0010m\u001a\u00020A8W@WX\u0096\u000e¢\u0006\u000f\u001a\u0005\b%\u0010ý\u0001\"\u0006\bþ\u0001\u0010ÿ\u0001R,\u0010\u0080\u0002\u001a\u00030Þ\u00012\b\u0010\u0080\u0002\u001a\u00030Þ\u00018V@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002\"\u0006\b\u0083\u0002\u0010\u0084\u0002R\u0019\u0010\u0086\u0002\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\bò\u0001\u0010\u0085\u0002R\u0019\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\bì\u0001\u0010\u0087\u0002¨\u0006\u008c\u0002"}, d2 = {"Landroidx/navigation/NavController;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/navigation/NavBackStackEntry;", "child", "parent", "", "U", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavBackStackEntry;)V", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "", IV8ValueMap.FUNCTION_ENTRIES, "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "backStackEntry", "handler", "E", "(Landroidx/navigation/Navigator;Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;Lkotlin/jvm/functions/Function1;)V", "popUpTo", "", "saveState", "GR", "(Landroidx/navigation/Navigator;Landroidx/navigation/NavBackStackEntry;ZLkotlin/jvm/functions/Function1;)V", "", "destinationId", "inclusive", "Nxk", "(IZZ)Z", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "route", "Y", "(Ljava/lang/Object;ZZ)Z", "", "k", "(Ljava/lang/String;ZZ)Z", "popOperations", "foundDestination", "Z", "(Ljava/util/List;Landroidx/navigation/NavDestination;ZZ)Z", "Lkotlin/collections/ArrayDeque;", "Landroidx/navigation/NavBackStackEntryState;", "savedState", "z", "(Landroidx/navigation/NavBackStackEntry;ZLkotlin/collections/ArrayDeque;)V", "r", "(I)Z", "o", "()Z", "Landroid/os/Bundle;", "startDestinationArgs", "M", "(Landroid/os/Bundle;)V", "", "deepLink", "nY", "([I)Ljava/lang/String;", "Landroidx/navigation/NavGraph;", "wTp", "(Lkotlin/collections/ArrayDeque;)Landroidx/navigation/NavGraph;", "g", "(Ljava/lang/Object;)Ljava/lang/String;", "node", "args", "eF", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Xw", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Z", "id", "eTf", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Z", "XQ", "(Ljava/util/List;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Z", "backStackState", "bzg", "(Lkotlin/collections/ArrayDeque;)Ljava/util/List;", "finalArgs", "restoredEntries", "ck", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavBackStackEntry;Ljava/util/List;)V", "n1", "()V", "eWT", "(Landroidx/navigation/NavBackStackEntry;)Landroidx/navigation/NavBackStackEntry;", "FX", "B", "(IZ)Z", "J", "D", "Lkotlin/Function0;", "onComplete", "I", "(Landroidx/navigation/NavBackStackEntry;Lkotlin/jvm/functions/Function0;)V", "ul", "ijL", "()Ljava/util/List;", "graphResId", "pJg", "(I)V", "ofS", "(ILandroid/os/Bundle;)V", "graph", "Mx", "(Landroidx/navigation/NavGraph;Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "rV9", "(Landroid/content/Intent;)Z", "matchingDest", "S", "(ILandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "searchChildren", "aYN", "(Landroidx/navigation/NavDestination;IZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "resId", "P5", "M7", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;)V", "p5", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "xg", "()Landroid/os/Bundle;", "navState", "m", "Landroidx/lifecycle/LifecycleOwner;", "owner", "G7", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "fcU", "(Landroidx/lifecycle/ViewModelStore;)V", "te", "(I)Landroidx/navigation/NavBackStackEntry;", "iF", "(Ljava/lang/String;)Landroidx/navigation/NavBackStackEntry;", c.f62177j, "Landroid/content/Context;", "fD", "()Landroid/content/Context;", "Landroid/app/Activity;", "rl", "Landroid/app/Activity;", "activity", "Landroidx/navigation/NavInflater;", "t", "Landroidx/navigation/NavInflater;", "inflater", "nr", "Landroidx/navigation/NavGraph;", "_graph", "O", "Landroid/os/Bundle;", "navigatorStateToRestore", "", "Landroid/os/Parcelable;", "J2", "[Landroid/os/Parcelable;", "backStackToRestore", "Uo", "deepLinkHandled", "KN", "Lkotlin/collections/ArrayDeque;", "backQueue", "LTFv/SPz;", "xMQ", "LTFv/SPz;", "_currentBackStack", "LTFv/rv6;", "mUb", "LTFv/rv6;", "getCurrentBackStack", "()LTFv/rv6;", "currentBackStack", "gh", "_visibleEntries", "qie", "v", "visibleEntries", "", "az", "Ljava/util/Map;", "childToParentEntries", "Ljava/util/concurrent/atomic/AtomicInteger;", "ty", "parentToChildCount", "HI", "backStackMap", "backStackStates", "Ik", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/navigation/NavControllerViewModel;", "Landroidx/navigation/NavControllerViewModel;", "viewModel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onDestinationChangedListeners", "Landroidx/lifecycle/Lifecycle$State;", "Landroidx/lifecycle/Lifecycle$State;", "N", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "hostLifecycleState", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "lifecycleObserver", "Landroidx/activity/OnBackPressedCallback;", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "WPU", "enableOnBackPressedCallback", "Landroidx/navigation/NavigatorProvider;", "Landroidx/navigation/NavigatorProvider;", "_navigatorProvider", "Landroidx/navigation/NavController$NavControllerNavigatorState;", "ViF", "navigatorState", "Lkotlin/jvm/functions/Function1;", "addToBackStackHandler", "popFromBackStackHandler", "entrySavedState", "dispatchReentrantCount", "", "Ljava/util/List;", "backStackEntriesToDispatch", "E2", "Lkotlin/Lazy;", "nHg", "()Landroidx/navigation/NavInflater;", "navInflater", "LTFv/r;", "e", "LTFv/r;", "_currentBackStackEntryFlow", "LTFv/Wre;", "X", "LTFv/Wre;", "getCurrentBackStackEntryFlow", "()LTFv/Wre;", "currentBackStackEntryFlow", "()I", "destinationCountOnBackStack", "()Landroidx/navigation/NavGraph;", "C", "(Landroidx/navigation/NavGraph;)V", "navigatorProvider", "s7N", "()Landroidx/navigation/NavigatorProvider;", "setNavigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "()Landroidx/navigation/NavDestination;", "currentDestination", "()Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntry", "Companion", "NavControllerNavigatorState", "OnDestinationChangedListener", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 Uri.kt\nandroidx/core/net/UriKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2927:1\n537#1,10:3077\n179#2,2:2928\n1313#2,2:2938\n1313#2,2:2940\n179#2,2:3075\n1#3:2930\n146#4:2931\n533#5,6:2932\n1855#5,2:2942\n1855#5,2:2944\n1855#5,2:2946\n1855#5,2:2948\n1864#5,3:2950\n1774#5,4:2953\n1855#5:2957\n766#5:2958\n857#5,2:2959\n1856#5:2961\n766#5:2962\n857#5,2:2963\n766#5:2965\n857#5,2:2966\n1855#5,2:2968\n1855#5:2970\n1789#5,3:2971\n1856#5:2974\n819#5:2982\n847#5,2:2983\n1855#5:2985\n1856#5:2993\n1238#5,4:2996\n1855#5,2:3000\n1855#5,2:3002\n378#5,7:3004\n1549#5:3011\n1620#5,3:3012\n1855#5,2:3015\n1855#5,2:3017\n819#5:3019\n847#5,2:3020\n1855#5,2:3022\n1855#5,2:3024\n533#5,6:3026\n533#5,6:3032\n533#5,6:3038\n1855#5,2:3044\n1855#5,2:3046\n1864#5,3:3049\n1855#5,2:3055\n533#5,6:3057\n533#5,6:3063\n533#5,6:3069\n372#6,7:2975\n372#6,7:2986\n453#6:2994\n403#6:2995\n29#7:3048\n13404#8,3:3052\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n*L\n-1#1:3077,10\n86#1:2928,2\n724#1:2938,2\n745#1:2940,2\n2810#1:3075,2\n169#1:2931\n662#1:2932,6\n902#1:2942,2\n905#1:2944,2\n911#1:2946,2\n913#1:2948,2\n992#1:2950,3\n1054#1:2953,4\n1198#1:2957\n1200#1:2958\n1200#1:2959,2\n1198#1:2961\n1208#1:2962\n1208#1:2963,2\n1211#1:2965\n1211#1:2966,2\n1282#1:2968,2\n1296#1:2970\n1300#1:2971,3\n1296#1:2974\n1359#1:2982\n1359#1:2983,2\n1360#1:2985\n1360#1:2993\n1711#1:2996,4\n1991#1:3000,2\n2054#1:3002,2\n2064#1:3004,7\n2073#1:3011\n2073#1:3012,3\n2090#1:3015,2\n2100#1:3017,2\n2167#1:3019\n2167#1:3020,2\n2171#1:3022,2\n2215#1:3024,2\n2257#1:3026,6\n2289#1:3032,6\n2318#1:3038,6\n2332#1:3044,2\n2348#1:3046,2\n2563#1:3049,3\n2604#1:3055,2\n2704#1:3057,6\n2725#1:3063,6\n2751#1:3069,6\n1346#1:2975,7\n1362#1:2986,7\n1711#1:2994\n1711#1:2995\n2441#1:3048\n2601#1:3052,3\n*E\n"})
public class NavController {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final Lazy navInflater;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final Map backStackMap;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Parcelable[] backStackToRestore;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final ArrayDeque backQueue;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Bundle navigatorStateToRestore;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final OnBackPressedCallback onBackPressedCallback;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private boolean deepLinkHandled;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private final Map navigatorState;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private boolean enableOnBackPressedCallback;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final Wre currentBackStackEntryFlow;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final LifecycleObserver lifecycleObserver;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private Lifecycle.State hostLifecycleState;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private NavigatorProvider _navigatorProvider;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final Map childToParentEntries;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final Map backStackStates;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final r _currentBackStackEntryFlow;

    /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
    private final List backStackEntriesToDispatch;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Function1 popFromBackStackHandler;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final SPz _visibleEntries;

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    private int dispatchReentrantCount;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final rv6 currentBackStack;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private Function1 addToBackStackHandler;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private NavGraph _graph;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList onDestinationChangedListeners;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final rv6 visibleEntries;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private NavControllerViewModel viewModel;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Activity activity;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private NavInflater inflater;

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private final Map entrySavedState;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final Map parentToChildCount;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final SPz _currentBackStack;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static boolean f40012N = true;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/navigation/NavController$NavControllerNavigatorState;", "Landroidx/navigation/NavigatorState;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigator", "<init>", "(Landroidx/navigation/NavController;Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "", "gh", "(Landroidx/navigation/NavBackStackEntry;)V", "HI", "destination", "Landroid/os/Bundle;", "arguments", c.f62177j, "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Landroidx/navigation/NavBackStackEntry;", "popUpTo", "", "saveState", "KN", "(Landroidx/navigation/NavBackStackEntry;Z)V", "xMQ", "entry", "O", "mUb", "Uo", "Landroidx/navigation/Navigator;", "getNavigator", "()Landroidx/navigation/Navigator;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$NavControllerNavigatorState\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2927:1\n146#2:2928\n146#2:2929\n2624#3,3:2930\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$NavControllerNavigatorState\n*L\n297#1:2928\n330#1:2929\n360#1:2930,3\n*E\n"})
    final class NavControllerNavigatorState extends NavigatorState {
        final /* synthetic */ NavController KN;

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private final Navigator navigator;

        public NavControllerNavigatorState(NavController navController, Navigator navigator) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            this.KN = navController;
            this.navigator = navigator;
        }

        public final void HI(NavBackStackEntry backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            super.gh(backStackEntry);
        }

        @Override // androidx.view.NavigatorState
        public void KN(final NavBackStackEntry popUpTo, final boolean saveState) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            Navigator navigatorO = this.KN._navigatorProvider.O(popUpTo.getDestination().getNavigatorName());
            this.KN.entrySavedState.put(popUpTo, Boolean.valueOf(saveState));
            if (!Intrinsics.areEqual(navigatorO, this.navigator)) {
                Object obj = this.KN.navigatorState.get(navigatorO);
                Intrinsics.checkNotNull(obj);
                ((NavControllerNavigatorState) obj).KN(popUpTo, saveState);
            } else {
                Function1 function1 = this.KN.popFromBackStackHandler;
                if (function1 == null) {
                    this.KN.I(popUpTo, new Function0<Unit>() { // from class: androidx.navigation.NavController$NavControllerNavigatorState$pop$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            super/*androidx.navigation.NavigatorState*/.KN(popUpTo, saveState);
                        }
                    });
                } else {
                    function1.invoke(popUpTo);
                    super.KN(popUpTo, saveState);
                }
            }
        }

        @Override // androidx.view.NavigatorState
        public void O(NavBackStackEntry entry) {
            NavControllerViewModel navControllerViewModel;
            Intrinsics.checkNotNullParameter(entry, "entry");
            boolean zAreEqual = Intrinsics.areEqual(this.KN.entrySavedState.get(entry), Boolean.TRUE);
            super.O(entry);
            this.KN.entrySavedState.remove(entry);
            if (this.KN.backQueue.contains(entry)) {
                if (getIsNavigating()) {
                    return;
                }
                this.KN.ul();
                this.KN._currentBackStack.t(CollectionsKt.toMutableList((Collection) this.KN.backQueue));
                this.KN._visibleEntries.t(this.KN.ijL());
                return;
            }
            this.KN.eWT(entry);
            if (entry.getLifecycleRegistry().getState().rl(Lifecycle.State.f38880O)) {
                entry.gh(Lifecycle.State.f38882n);
            }
            ArrayDeque arrayDeque = this.KN.backQueue;
            if (arrayDeque == null || !arrayDeque.isEmpty()) {
                Iterator<E> it = arrayDeque.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((NavBackStackEntry) it.next()).getId(), entry.getId())) {
                        break;
                    }
                }
                if (!zAreEqual && (navControllerViewModel = this.KN.viewModel) != null) {
                    navControllerViewModel.t(entry.getId());
                }
            } else if (!zAreEqual) {
                navControllerViewModel.t(entry.getId());
            }
            this.KN.ul();
            this.KN._visibleEntries.t(this.KN.ijL());
        }

        @Override // androidx.view.NavigatorState
        public void gh(NavBackStackEntry backStackEntry) {
            Intrinsics.checkNotNullParameter(backStackEntry, KfLR.GeyLqGvfnh);
            Navigator navigatorO = this.KN._navigatorProvider.O(backStackEntry.getDestination().getNavigatorName());
            if (!Intrinsics.areEqual(navigatorO, this.navigator)) {
                Object obj = this.KN.navigatorState.get(navigatorO);
                if (obj != null) {
                    ((NavControllerNavigatorState) obj).gh(backStackEntry);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
            }
            Function1 function1 = this.KN.addToBackStackHandler;
            if (function1 != null) {
                function1.invoke(backStackEntry);
                HI(backStackEntry);
                return;
            }
            Log.i("NavController", "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
        }

        @Override // androidx.view.NavigatorState
        public void mUb(NavBackStackEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            super.mUb(entry);
            if (!this.KN.backQueue.contains(entry)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            entry.gh(Lifecycle.State.J2);
        }

        @Override // androidx.view.NavigatorState
        public NavBackStackEntry n(NavDestination destination, Bundle arguments) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return NavBackStackEntry.Companion.rl(NavBackStackEntry.INSTANCE, this.KN.getContext(), destination, arguments, this.KN.N(), this.KN.viewModel, null, null, 96, null);
        }

        @Override // androidx.view.NavigatorState
        public void xMQ(NavBackStackEntry popUpTo, boolean saveState) {
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            super.xMQ(popUpTo, saveState);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "Landroidx/navigation/NavController;", "controller", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "", c.f62177j, "(Landroidx/navigation/NavController;Landroidx/navigation/NavDestination;Landroid/os/Bundle;)V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface OnDestinationChangedListener {
        void n(NavController controller, NavDestination destination, Bundle arguments);
    }

    public boolean B(int destinationId, boolean inclusive) {
        return J(destinationId, inclusive, false);
    }

    public void M7(int resId, Bundle args, NavOptions navOptions) {
        p5(resId, args, navOptions, null);
    }

    public void P5(int resId, Bundle args) {
        M7(resId, args, null);
    }

    public NavController(Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Iterator it = SequencesKt.generateSequence(context, new Function1<Context, Context>() { // from class: androidx.navigation.NavController$activity$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Context invoke(Context it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.activity = (Activity) next;
        this.backQueue = new ArrayDeque();
        SPz sPzN = Lu.n(CollectionsKt.emptyList());
        this._currentBackStack = sPzN;
        this.currentBackStack = fuX.t(sPzN);
        SPz sPzN2 = Lu.n(CollectionsKt.emptyList());
        this._visibleEntries = sPzN2;
        this.visibleEntries = fuX.t(sPzN2);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new CopyOnWriteArrayList();
        this.hostLifecycleState = Lifecycle.State.f38885t;
        this.lifecycleObserver = new LifecycleEventObserver() { // from class: androidx.navigation.j
            @Override // androidx.view.LifecycleEventObserver
            public final void Z(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                NavController.jB(this.f40447n, lifecycleOwner, event);
            }
        };
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void Uo() {
                this.nr.FX();
            }
        };
        this.enableOnBackPressedCallback = true;
        this._navigatorProvider = new NavigatorProvider();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        NavigatorProvider navigatorProvider = this._navigatorProvider;
        navigatorProvider.rl(new NavGraphNavigator(navigatorProvider));
        this._navigatorProvider.rl(new ActivityNavigator(this.context));
        this.backStackEntriesToDispatch = new ArrayList();
        this.navInflater = LazyKt.lazy(new Function0<NavInflater>() { // from class: androidx.navigation.NavController$navInflater$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final NavInflater invoke() {
                NavInflater navInflater = this.f40046n.inflater;
                return navInflater == null ? new NavInflater(this.f40046n.getContext(), this.f40046n._navigatorProvider) : navInflater;
            }
        });
        r rVarRl = nKK.rl(1, 0, j.f4187t, 2, null);
        this._currentBackStackEntryFlow = rVarRl;
        this.currentBackStackEntryFlow = fuX.rl(rVarRl);
    }

    private final void E(Navigator navigator, List list, NavOptions navOptions, Navigator.Extras extras, Function1 function1) {
        this.addToBackStackHandler = function1;
        navigator.O(list, navOptions, extras);
        this.addToBackStackHandler = null;
    }

    private final void GR(Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z2, Function1 function1) {
        this.popFromBackStackHandler = function1;
        navigator.mUb(navBackStackEntry, z2);
        this.popFromBackStackHandler = null;
    }

    static /* synthetic */ void Ik(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i2 & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        navController.ck(navDestination, bundle, navBackStackEntry, list);
    }

    private final void M(Bundle startDestinationArgs) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle = this.navigatorStateToRestore;
        if (bundle != null && (stringArrayList = bundle.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            for (String name : stringArrayList) {
                NavigatorProvider navigatorProvider = this._navigatorProvider;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Navigator navigatorO = navigatorProvider.O(name);
                Bundle bundle2 = bundle.getBundle(name);
                if (bundle2 != null) {
                    navigatorO.KN(bundle2);
                }
            }
        }
        Parcelable[] parcelableArr = this.backStackToRestore;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination navDestinationWPU = WPU(this, navBackStackEntryState.getDestinationId(), null, 2, null);
                if (navDestinationWPU == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + NavDestination.INSTANCE.rl(this.context, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + e());
                }
                NavBackStackEntry navBackStackEntryT = navBackStackEntryState.t(this.context, navDestinationWPU, N(), this.viewModel);
                Navigator navigatorO2 = this._navigatorProvider.O(navDestinationWPU.getNavigatorName());
                Map map = this.navigatorState;
                Object navControllerNavigatorState = map.get(navigatorO2);
                if (navControllerNavigatorState == null) {
                    navControllerNavigatorState = new NavControllerNavigatorState(this, navigatorO2);
                    map.put(navigatorO2, navControllerNavigatorState);
                }
                this.backQueue.add(navBackStackEntryT);
                ((NavControllerNavigatorState) navControllerNavigatorState).HI(navBackStackEntryT);
                NavGraph parent = navBackStackEntryT.getDestination().getParent();
                if (parent != null) {
                    U(navBackStackEntryT, te(parent.getId()));
                }
            }
            n1();
            this.backStackToRestore = null;
        }
        Collection collectionValues = this._navigatorProvider.J2().values();
        ArrayList<Navigator> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((Navigator) obj).getIsAttached()) {
                arrayList.add(obj);
            }
        }
        for (Navigator navigator : arrayList) {
            Map map2 = this.navigatorState;
            Object navControllerNavigatorState2 = map2.get(navigator);
            if (navControllerNavigatorState2 == null) {
                navControllerNavigatorState2 = new NavControllerNavigatorState(this, navigator);
                map2.put(navigator, navControllerNavigatorState2);
            }
            navigator.J2((NavControllerNavigatorState) navControllerNavigatorState2);
        }
        if (this._graph == null || !this.backQueue.isEmpty()) {
            o();
            return;
        }
        if (!this.deepLinkHandled && (activity = this.activity) != null) {
            Intrinsics.checkNotNull(activity);
            if (rV9(activity.getIntent())) {
                return;
            }
        }
        NavGraph navGraph = this._graph;
        Intrinsics.checkNotNull(navGraph);
        eF(navGraph, startDestinationArgs, null, null);
    }

    private final boolean Nxk(int destinationId, boolean inclusive, boolean saveState) {
        NavDestination destination;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.reversed(this.backQueue).iterator();
        while (true) {
            if (!it.hasNext()) {
                destination = null;
                break;
            }
            destination = ((NavBackStackEntry) it.next()).getDestination();
            Navigator navigatorO = this._navigatorProvider.O(destination.getNavigatorName());
            if (inclusive || destination.getId() != destinationId) {
                arrayList.add(navigatorO);
            }
            if (destination.getId() == destinationId) {
                break;
            }
        }
        if (destination != null) {
            return Z(arrayList, destination, inclusive, saveState);
        }
        Log.i("NavController", "Ignoring popBackStack to destination " + NavDestination.INSTANCE.rl(this.context, destinationId) + " as it was not found on the current back stack");
        return false;
    }

    private final void U(NavBackStackEntry child, NavBackStackEntry parent) {
        this.childToParentEntries.put(child, parent);
        if (this.parentToChildCount.get(parent) == null) {
            this.parentToChildCount.put(parent, new AtomicInteger(0));
        }
        Object obj = this.parentToChildCount.get(parent);
        Intrinsics.checkNotNull(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    public static /* synthetic */ NavDestination ViF(NavController navController, NavDestination navDestination, int i2, boolean z2, NavDestination navDestination2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
        }
        if ((i3 & 4) != 0) {
            navDestination2 = null;
        }
        return navController.aYN(navDestination, i2, z2, navDestination2);
    }

    public static /* synthetic */ NavDestination WPU(NavController navController, int i2, NavDestination navDestination, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i3 & 2) != 0) {
            navDestination = null;
        }
        return navController.S(i2, navDestination);
    }

    private final int X() {
        ArrayDeque arrayDeque = this.backQueue;
        int i2 = 0;
        if (arrayDeque != null && arrayDeque.isEmpty()) {
            return 0;
        }
        Iterator<E> it = arrayDeque.iterator();
        while (it.hasNext()) {
            if (!(((NavBackStackEntry) it.next()).getDestination() instanceof NavGraph) && (i2 = i2 + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i2;
    }

    private final boolean XQ(final List entries, final Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        NavBackStackEntry navBackStackEntry;
        NavDestination destination;
        ArrayList<List> arrayList = new ArrayList();
        ArrayList<NavBackStackEntry> arrayList2 = new ArrayList();
        for (Object obj : entries) {
            if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                arrayList2.add(obj);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayList2) {
            List list = (List) CollectionsKt.lastOrNull((List) arrayList);
            if (Intrinsics.areEqual((list == null || (navBackStackEntry = (NavBackStackEntry) CollectionsKt.last(list)) == null || (destination = navBackStackEntry.getDestination()) == null) ? null : destination.getNavigatorName(), navBackStackEntry2.getDestination().getNavigatorName())) {
                list.add(navBackStackEntry2);
            } else {
                arrayList.add(CollectionsKt.mutableListOf(navBackStackEntry2));
            }
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (List list2 : arrayList) {
            Navigator navigatorO = this._navigatorProvider.O(((NavBackStackEntry) CollectionsKt.first(list2)).getDestination().getNavigatorName());
            final Ref.IntRef intRef = new Ref.IntRef();
            E(navigatorO, list2, navOptions, navigatorExtras, new Function1<NavBackStackEntry, Unit>() { // from class: androidx.navigation.NavController$executeRestoreState$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry3) {
                    n(navBackStackEntry3);
                    return Unit.INSTANCE;
                }

                public final void n(NavBackStackEntry entry) {
                    List listEmptyList;
                    Intrinsics.checkNotNullParameter(entry, "entry");
                    booleanRef.element = true;
                    int iIndexOf = entries.indexOf(entry);
                    if (iIndexOf != -1) {
                        int i2 = iIndexOf + 1;
                        listEmptyList = entries.subList(intRef.element, i2);
                        intRef.element = i2;
                    } else {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    this.ck(entry.getDestination(), args, entry, listEmptyList);
                }
            });
        }
        return booleanRef.element;
    }

    private final boolean Z(List popOperations, NavDestination foundDestination, boolean inclusive, boolean saveState) {
        final NavController navController;
        final boolean z2;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = popOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                navController = this;
                z2 = saveState;
                break;
            }
            Navigator navigator = (Navigator) it.next();
            final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            navController = this;
            z2 = saveState;
            GR(navigator, (NavBackStackEntry) this.backQueue.last(), z2, new Function1<NavBackStackEntry, Unit>() { // from class: androidx.navigation.NavController$executePopOperations$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry) {
                    n(navBackStackEntry);
                    return Unit.INSTANCE;
                }

                public final void n(NavBackStackEntry entry) {
                    Intrinsics.checkNotNullParameter(entry, "entry");
                    booleanRef2.element = true;
                    booleanRef.element = true;
                    navController.z(entry, z2, arrayDeque);
                }
            });
            if (!booleanRef2.element) {
                break;
            }
            saveState = z2;
        }
        if (z2) {
            if (!inclusive) {
                for (NavDestination navDestination : SequencesKt.takeWhile(SequencesKt.generateSequence(foundDestination, new Function1<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController$executePopOperations$2
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final NavDestination invoke(NavDestination navDestination2) {
                        Intrinsics.checkNotNullParameter(navDestination2, IYJfqUyym.krvkZ);
                        NavGraph parent = navDestination2.getParent();
                        if (parent == null || parent.getStartDestId() != navDestination2.getId()) {
                            return null;
                        }
                        return navDestination2.getParent();
                    }
                }), new Function1<NavDestination, Boolean>() { // from class: androidx.navigation.NavController$executePopOperations$3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(NavDestination destination) {
                        Intrinsics.checkNotNullParameter(destination, "destination");
                        return Boolean.valueOf(!this.f40034n.backStackMap.containsKey(Integer.valueOf(destination.getId())));
                    }
                })) {
                    Map map = navController.backStackMap;
                    Integer numValueOf = Integer.valueOf(navDestination.getId());
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) arrayDeque.firstOrNull();
                    map.put(numValueOf, navBackStackEntryState != null ? navBackStackEntryState.getId() : null);
                }
            }
            if (!arrayDeque.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) arrayDeque.first();
                Iterator it2 = SequencesKt.takeWhile(SequencesKt.generateSequence(WPU(this, navBackStackEntryState2.getDestinationId(), null, 2, null), new Function1<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController$executePopOperations$5
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final NavDestination invoke(NavDestination destination) {
                        Intrinsics.checkNotNullParameter(destination, "destination");
                        NavGraph parent = destination.getParent();
                        if (parent == null || parent.getStartDestId() != destination.getId()) {
                            return null;
                        }
                        return destination.getParent();
                    }
                }), new Function1<NavDestination, Boolean>() { // from class: androidx.navigation.NavController$executePopOperations$6
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(NavDestination destination) {
                        Intrinsics.checkNotNullParameter(destination, "destination");
                        return Boolean.valueOf(!this.f40036n.backStackMap.containsKey(Integer.valueOf(destination.getId())));
                    }
                }).iterator();
                while (it2.hasNext()) {
                    navController.backStackMap.put(Integer.valueOf(((NavDestination) it2.next()).getId()), navBackStackEntryState2.getId());
                }
                if (navController.backStackMap.values().contains(navBackStackEntryState2.getId())) {
                    navController.backStackStates.put(navBackStackEntryState2.getId(), arrayDeque);
                }
            }
        }
        n1();
        return booleanRef.element;
    }

    public static /* synthetic */ boolean a(NavController navController, String str, boolean z2, boolean z3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        return navController.D(str, z2, z3);
    }

    private final List bzg(ArrayDeque backStackState) {
        NavDestination navDestinationT;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.lastOrNull();
        if (navBackStackEntry == null || (navDestinationT = navBackStackEntry.getDestination()) == null) {
            navDestinationT = T();
        }
        if (backStackState != null) {
            Iterator<E> it = backStackState.iterator();
            NavDestination navDestination = navDestinationT;
            while (it.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it.next();
                NavDestination navDestinationViF = ViF(this, navDestination, navBackStackEntryState.getDestinationId(), true, null, 4, null);
                if (navDestinationViF == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.INSTANCE.rl(this.context, navBackStackEntryState.getDestinationId()) + " cannot be found from the current destination " + navDestination).toString());
                }
                arrayList.add(navBackStackEntryState.t(this.context, navDestinationViF, N(), this.viewModel));
                navDestination = navDestinationViF;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ck(NavDestination node, Bundle finalArgs, NavBackStackEntry backStackEntry, List restoredEntries) {
        Bundle bundle;
        ArrayDeque<NavBackStackEntry> arrayDeque;
        NavDestination destination;
        List list;
        NavBackStackEntry navBackStackEntry;
        NavGraph navGraph;
        Object objPrevious;
        Object objPrevious2;
        List list2 = restoredEntries;
        NavDestination destination2 = backStackEntry.getDestination();
        if (!(destination2 instanceof FloatingWindow)) {
            while (!this.backQueue.isEmpty() && (((NavBackStackEntry) this.backQueue.last()).getDestination() instanceof FloatingWindow) && dR0(this, ((NavBackStackEntry) this.backQueue.last()).getDestination().getId(), true, false, 4, null)) {
            }
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        Object obj = null;
        if (node instanceof NavGraph) {
            NavDestination navDestination = destination2;
            while (true) {
                Intrinsics.checkNotNull(navDestination);
                NavGraph parent = navDestination.getParent();
                if (parent != null) {
                    ListIterator listIterator = list2.listIterator(list2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious2 = listIterator.previous();
                            if (Intrinsics.areEqual(((NavBackStackEntry) objPrevious2).getDestination(), parent)) {
                                break;
                            }
                        } else {
                            objPrevious2 = null;
                            break;
                        }
                    }
                    NavBackStackEntry navBackStackEntryRl = (NavBackStackEntry) objPrevious2;
                    if (navBackStackEntryRl == null) {
                        bundle = finalArgs;
                        destination = destination2;
                        navBackStackEntryRl = NavBackStackEntry.Companion.rl(NavBackStackEntry.INSTANCE, this.context, parent, bundle, N(), this.viewModel, null, null, 96, null);
                    } else {
                        bundle = finalArgs;
                        destination = destination2;
                    }
                    arrayDeque2.addFirst(navBackStackEntryRl);
                    if (this.backQueue.isEmpty() || ((NavBackStackEntry) this.backQueue.last()).getDestination() != parent) {
                        navBackStackEntry = backStackEntry;
                        list = restoredEntries;
                        arrayDeque = arrayDeque2;
                    } else {
                        list = restoredEntries;
                        arrayDeque = arrayDeque2;
                        navBackStackEntry = backStackEntry;
                        piY(this, (NavBackStackEntry) this.backQueue.last(), false, null, 6, null);
                    }
                } else {
                    bundle = finalArgs;
                    arrayDeque = arrayDeque2;
                    destination = destination2;
                    list = list2;
                    navBackStackEntry = backStackEntry;
                }
                if (parent == null || parent == node) {
                    break;
                }
                list2 = list;
                navDestination = parent;
                arrayDeque2 = arrayDeque;
                destination2 = destination;
            }
        } else {
            bundle = finalArgs;
            arrayDeque = arrayDeque2;
            destination = destination2;
            list = list2;
            navBackStackEntry = backStackEntry;
        }
        NavDestination destination3 = arrayDeque.isEmpty() ? destination : ((NavBackStackEntry) arrayDeque.first()).getDestination();
        while (destination3 != null && S(destination3.getId(), destination3) != destination3) {
            NavGraph parent2 = destination3.getParent();
            if (parent2 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious = listIterator2.previous();
                        if (Intrinsics.areEqual(((NavBackStackEntry) objPrevious).getDestination(), parent2)) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntryRl2 = (NavBackStackEntry) objPrevious;
                if (navBackStackEntryRl2 == null) {
                    navGraph = parent2;
                    navBackStackEntryRl2 = NavBackStackEntry.Companion.rl(NavBackStackEntry.INSTANCE, this.context, navGraph, parent2.Uo(bundle2), N(), this.viewModel, null, null, 96, null);
                } else {
                    navGraph = parent2;
                }
                arrayDeque.addFirst(navBackStackEntryRl2);
            } else {
                navGraph = parent2;
            }
            destination3 = navGraph;
        }
        if (!arrayDeque.isEmpty()) {
            destination = ((NavBackStackEntry) arrayDeque.first()).getDestination();
        }
        while (!this.backQueue.isEmpty() && (((NavBackStackEntry) this.backQueue.last()).getDestination() instanceof NavGraph)) {
            NavDestination destination4 = ((NavBackStackEntry) this.backQueue.last()).getDestination();
            Intrinsics.checkNotNull(destination4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((NavGraph) destination4).getNodes().O(destination.getId()) != null) {
                break;
            } else {
                piY(this, (NavBackStackEntry) this.backQueue.last(), false, null, 6, null);
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) this.backQueue.firstOrNull();
        if (navBackStackEntry2 == null) {
            navBackStackEntry2 = (NavBackStackEntry) arrayDeque.firstOrNull();
        }
        if (!Intrinsics.areEqual(navBackStackEntry2 != null ? navBackStackEntry2.getDestination() : null, this._graph)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                NavDestination destination5 = ((NavBackStackEntry) objPrevious3).getDestination();
                NavGraph navGraph2 = this._graph;
                Intrinsics.checkNotNull(navGraph2);
                if (Intrinsics.areEqual(destination5, navGraph2)) {
                    obj = objPrevious3;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntryRl3 = (NavBackStackEntry) obj;
            if (navBackStackEntryRl3 == null) {
                NavBackStackEntry.Companion companion = NavBackStackEntry.INSTANCE;
                Context context = this.context;
                NavGraph navGraph3 = this._graph;
                Intrinsics.checkNotNull(navGraph3);
                NavGraph navGraph4 = this._graph;
                Intrinsics.checkNotNull(navGraph4);
                navBackStackEntryRl3 = NavBackStackEntry.Companion.rl(companion, context, navGraph3, navGraph4.Uo(bundle), N(), this.viewModel, null, null, 96, null);
            }
            arrayDeque.addFirst(navBackStackEntryRl3);
        }
        for (NavBackStackEntry navBackStackEntry3 : arrayDeque) {
            Object obj2 = this.navigatorState.get(this._navigatorProvider.O(navBackStackEntry3.getDestination().getNavigatorName()));
            if (obj2 == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + node.getNavigatorName() + " should already be created").toString());
            }
            ((NavControllerNavigatorState) obj2).HI(navBackStackEntry3);
        }
        this.backQueue.addAll(arrayDeque);
        this.backQueue.add(navBackStackEntry);
        for (NavBackStackEntry navBackStackEntry4 : CollectionsKt.plus((Collection<? extends NavBackStackEntry>) arrayDeque, navBackStackEntry)) {
            NavGraph parent3 = navBackStackEntry4.getDestination().getParent();
            if (parent3 != null) {
                U(navBackStackEntry4, te(parent3.getId()));
            }
        }
    }

    static /* synthetic */ boolean dR0(NavController navController, int i2, boolean z2, boolean z3, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        return navController.Nxk(i2, z2, z3);
    }

    private final void eF(final NavDestination node, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        boolean z2;
        boolean z3;
        boolean zNxk;
        Iterator it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).az(true);
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (navOptions == null) {
            z2 = false;
        } else {
            if (navOptions.getPopUpToRoute() != null) {
                String popUpToRoute = navOptions.getPopUpToRoute();
                Intrinsics.checkNotNull(popUpToRoute);
                zNxk = k(popUpToRoute, navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else if (navOptions.getPopUpToRouteClass() != null) {
                KClass popUpToRouteClass = navOptions.getPopUpToRouteClass();
                Intrinsics.checkNotNull(popUpToRouteClass);
                zNxk = Nxk(RouteSerializerKt.Uo(XA.r.t(popUpToRouteClass)), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else if (navOptions.getPopUpToRouteObject() != null) {
                Object popUpToRouteObject = navOptions.getPopUpToRouteObject();
                Intrinsics.checkNotNull(popUpToRouteObject);
                zNxk = Y(popUpToRouteObject, navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else {
                if (navOptions.getPopUpToId() != -1) {
                    zNxk = Nxk(navOptions.getPopUpToId(), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
                }
                z2 = false;
            }
            z2 = zNxk;
        }
        final Bundle bundleUo = node.Uo(args);
        if (navOptions != null && navOptions.getRestoreState() && this.backStackMap.containsKey(Integer.valueOf(node.getId()))) {
            booleanRef.element = eTf(node.getId(), bundleUo, navOptions, navigatorExtras);
            z3 = false;
        } else {
            z3 = navOptions != null && navOptions.getSingleTop() && Xw(node, args);
            if (!z3) {
                E(this._navigatorProvider.O(node.getNavigatorName()), CollectionsKt.listOf(NavBackStackEntry.Companion.rl(NavBackStackEntry.INSTANCE, this.context, node, bundleUo, N(), this.viewModel, null, null, 96, null)), navOptions, navigatorExtras, new Function1<NavBackStackEntry, Unit>() { // from class: androidx.navigation.NavController$navigate$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry) {
                        n(navBackStackEntry);
                        return Unit.INSTANCE;
                    }

                    public final void n(NavBackStackEntry it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        booleanRef.element = true;
                        NavController.Ik(this, node, bundleUo, it2, null, 8, null);
                    }
                });
            }
        }
        n1();
        Iterator it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).az(false);
        }
        if (z2 || booleanRef.element || z3) {
            o();
        } else {
            ul();
        }
    }

    private final boolean eTf(int id, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        if (!this.backStackMap.containsKey(Integer.valueOf(id))) {
            return false;
        }
        final String str = (String) this.backStackMap.get(Integer.valueOf(id));
        CollectionsKt.removeAll(this.backStackMap.values(), new Function1<String, Boolean>() { // from class: androidx.navigation.NavController$restoreStateInternal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String str2) {
                return Boolean.valueOf(Intrinsics.areEqual(str2, str));
            }
        });
        return XQ(bzg((ArrayDeque) TypeIntrinsics.asMutableMap(this.backStackStates).remove(str)), args, navOptions, navigatorExtras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jB(NavController this$0, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        this$0.hostLifecycleState = event.t();
        if (this$0._graph != null) {
            Iterator it = CollectionsKt.toMutableList((Collection) this$0.backQueue).iterator();
            while (it.hasNext()) {
                ((NavBackStackEntry) it.next()).KN(event);
            }
        }
    }

    private final boolean k(String route, boolean inclusive, boolean saveState) {
        Object objPrevious;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = this.backQueue;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            boolean zR = navBackStackEntry.getDestination().r(route, navBackStackEntry.t());
            if (inclusive || !zR) {
                arrayList.add(this._navigatorProvider.O(navBackStackEntry.getDestination().getNavigatorName()));
            }
            if (zR) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) objPrevious;
        NavDestination destination = navBackStackEntry2 != null ? navBackStackEntry2.getDestination() : null;
        if (destination != null) {
            return Z(arrayList, destination, inclusive, saveState);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void n1() {
        boolean z2;
        OnBackPressedCallback onBackPressedCallback = this.onBackPressedCallback;
        if (this.enableOnBackPressedCallback) {
            z2 = X() > 1;
        }
        onBackPressedCallback.az(z2);
    }

    private final String nY(int[] deepLink) {
        NavGraph navGraph;
        NavGraph navGraph2 = this._graph;
        int length = deepLink.length;
        int i2 = 0;
        while (true) {
            NavDestination navDestinationE2 = null;
            if (i2 >= length) {
                return null;
            }
            int i3 = deepLink[i2];
            if (i2 == 0) {
                NavGraph navGraph3 = this._graph;
                Intrinsics.checkNotNull(navGraph3);
                if (navGraph3.getId() == i3) {
                    navDestinationE2 = this._graph;
                }
            } else {
                Intrinsics.checkNotNull(navGraph2);
                navDestinationE2 = navGraph2.E2(i3);
            }
            if (navDestinationE2 == null) {
                return NavDestination.INSTANCE.rl(this.context, i3);
            }
            if (i2 != deepLink.length - 1 && (navDestinationE2 instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestinationE2;
                    Intrinsics.checkNotNull(navGraph);
                    if (!(navGraph.E2(navGraph.getStartDestId()) instanceof NavGraph)) {
                        break;
                    }
                    navDestinationE2 = navGraph.E2(navGraph.getStartDestId());
                }
                navGraph2 = navGraph;
            }
            i2++;
        }
    }

    private final boolean o() {
        while (!this.backQueue.isEmpty() && (((NavBackStackEntry) this.backQueue.last()).getDestination() instanceof NavGraph)) {
            piY(this, (NavBackStackEntry) this.backQueue.last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.lastOrNull();
        if (navBackStackEntry != null) {
            this.backStackEntriesToDispatch.add(navBackStackEntry);
        }
        this.dispatchReentrantCount++;
        ul();
        int i2 = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i2;
        if (i2 == 0) {
            List<NavBackStackEntry> mutableList = CollectionsKt.toMutableList((Collection) this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (NavBackStackEntry navBackStackEntry2 : mutableList) {
                Iterator it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    ((OnDestinationChangedListener) it.next()).n(this, navBackStackEntry2.getDestination(), navBackStackEntry2.t());
                }
                this._currentBackStackEntryFlow.t(navBackStackEntry2);
            }
            this._currentBackStack.t(CollectionsKt.toMutableList((Collection) this.backQueue));
            this._visibleEntries.t(ijL());
        }
        return navBackStackEntry != null;
    }

    static /* synthetic */ void piY(NavController navController, NavBackStackEntry navBackStackEntry, boolean z2, ArrayDeque arrayDeque, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            arrayDeque = new ArrayDeque();
        }
        navController.z(navBackStackEntry, z2, arrayDeque);
    }

    private final boolean r(int destinationId) {
        Iterator it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).az(true);
        }
        boolean zETf = eTf(destinationId, null, NavOptionsBuilderKt.n(new Function1<NavOptionsBuilder, Unit>() { // from class: androidx.navigation.NavController$clearBackStackInternal$restored$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder navOptionsBuilder) {
                n(navOptionsBuilder);
                return Unit.INSTANCE;
            }

            public final void n(NavOptionsBuilder navOptions) {
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                navOptions.Uo(true);
            }
        }), null);
        Iterator it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).az(false);
        }
        return zETf && Nxk(destinationId, true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(NavBackStackEntry popUpTo, boolean saveState, ArrayDeque savedState) {
        NavControllerViewModel navControllerViewModel;
        rv6 rv6VarT;
        Set set;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.last();
        if (!Intrinsics.areEqual(navBackStackEntry, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.getDestination() + ", which is not the top of the back stack (" + navBackStackEntry.getDestination() + ')').toString());
        }
        CollectionsKt.removeLast(this.backQueue);
        NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.navigatorState.get(get_navigatorProvider().O(navBackStackEntry.getDestination().getNavigatorName()));
        boolean z2 = true;
        if ((navControllerNavigatorState == null || (rv6VarT = navControllerNavigatorState.getTransitionsInProgress()) == null || (set = (Set) rv6VarT.getValue()) == null || !set.contains(navBackStackEntry)) && !this.parentToChildCount.containsKey(navBackStackEntry)) {
            z2 = false;
        }
        Lifecycle.State state = navBackStackEntry.getLifecycleRegistry().getState();
        Lifecycle.State state2 = Lifecycle.State.f38880O;
        if (state.rl(state2)) {
            if (saveState) {
                navBackStackEntry.gh(state2);
                savedState.addFirst(new NavBackStackEntryState(navBackStackEntry));
            }
            if (z2) {
                navBackStackEntry.gh(state2);
            } else {
                navBackStackEntry.gh(Lifecycle.State.f38882n);
                eWT(navBackStackEntry);
            }
        }
        if (saveState || z2 || (navControllerViewModel = this.viewModel) == null) {
            return;
        }
        navControllerViewModel.t(navBackStackEntry.getId());
    }

    public void C(NavGraph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        Mx(graph, null);
    }

    public final boolean D(String route, boolean inclusive, boolean saveState) {
        Intrinsics.checkNotNullParameter(route, "route");
        return k(route, inclusive, saveState) && o();
    }

    public NavBackStackEntry E2() {
        return (NavBackStackEntry) this.backQueue.lastOrNull();
    }

    public boolean FX() {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        NavDestination navDestinationE = e();
        Intrinsics.checkNotNull(navDestinationE);
        return B(navDestinationE.getId(), true);
    }

    public void G7(LifecycleOwner owner) {
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (Intrinsics.areEqual(owner, this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycleRegistry()) != null) {
            lifecycle.nr(this.lifecycleObserver);
        }
        this.lifecycleOwner = owner;
        owner.getLifecycleRegistry().n(this.lifecycleObserver);
    }

    public final void I(NavBackStackEntry popUpTo, Function0 onComplete) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        int iIndexOf = this.backQueue.indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i2 = iIndexOf + 1;
        if (i2 != this.backQueue.size()) {
            Nxk(((NavBackStackEntry) this.backQueue.get(i2)).getDestination().getId(), true, false);
        }
        piY(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        n1();
        o();
    }

    public void Mx(NavGraph graph, Bundle startDestinationArgs) {
        NavController navController;
        Intrinsics.checkNotNullParameter(graph, "graph");
        if (!this.backQueue.isEmpty() && N() == Lifecycle.State.f38882n) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        if (!Intrinsics.areEqual(this._graph, graph)) {
            NavGraph navGraph = this._graph;
            if (navGraph != null) {
                for (Integer id : new ArrayList(this.backStackMap.keySet())) {
                    Intrinsics.checkNotNullExpressionValue(id, "id");
                    r(id.intValue());
                }
                navController = this;
                dR0(navController, navGraph.getId(), true, false, 4, null);
            } else {
                navController = this;
            }
            navController._graph = graph;
            M(startDestinationArgs);
            return;
        }
        int iCk = graph.getNodes().ck();
        for (int i2 = 0; i2 < iCk; i2++) {
            NavDestination navDestination = (NavDestination) graph.getNodes().Ik(i2);
            NavGraph navGraph2 = this._graph;
            Intrinsics.checkNotNull(navGraph2);
            int iQie = navGraph2.getNodes().qie(i2);
            NavGraph navGraph3 = this._graph;
            Intrinsics.checkNotNull(navGraph3);
            navGraph3.getNodes().HI(iQie, navDestination);
        }
        for (NavBackStackEntry navBackStackEntry : this.backQueue) {
            List<NavDestination> listAsReversed = CollectionsKt.asReversed(SequencesKt.toList(NavDestination.INSTANCE.t(navBackStackEntry.getDestination())));
            NavDestination navDestinationE2 = this._graph;
            Intrinsics.checkNotNull(navDestinationE2);
            for (NavDestination navDestination2 : listAsReversed) {
                if (!Intrinsics.areEqual(navDestination2, this._graph) || !Intrinsics.areEqual(navDestinationE2, graph)) {
                    if (navDestinationE2 instanceof NavGraph) {
                        navDestinationE2 = ((NavGraph) navDestinationE2).E2(navDestination2.getId());
                        Intrinsics.checkNotNull(navDestinationE2);
                    }
                }
            }
            navBackStackEntry.mUb(navDestinationE2);
        }
    }

    public final Lifecycle.State N() {
        return this.lifecycleOwner == null ? Lifecycle.State.f38880O : this.hostLifecycleState;
    }

    public final NavDestination S(int destinationId, NavDestination matchingDest) {
        NavDestination destination;
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            return null;
        }
        Intrinsics.checkNotNull(navGraph);
        if (navGraph.getId() == destinationId) {
            if (matchingDest == null) {
                return this._graph;
            }
            if (Intrinsics.areEqual(this._graph, matchingDest) && matchingDest.getParent() == null) {
                return this._graph;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.backQueue.lastOrNull();
        if (navBackStackEntry == null || (destination = navBackStackEntry.getDestination()) == null) {
            destination = this._graph;
            Intrinsics.checkNotNull(destination);
        }
        return aYN(destination, destinationId, false, matchingDest);
    }

    public NavGraph T() {
        NavGraph navGraph = this._graph;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        Intrinsics.checkNotNull(navGraph, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return navGraph;
    }

    public final NavDestination aYN(NavDestination navDestination, int i2, boolean z2, NavDestination navDestination2) {
        NavGraph navGraph;
        Intrinsics.checkNotNullParameter(navDestination, "<this>");
        if (navDestination.getId() == i2 && (navDestination2 == null || (Intrinsics.areEqual(navDestination, navDestination2) && Intrinsics.areEqual(navDestination.getParent(), navDestination2.getParent())))) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            navGraph = (NavGraph) navDestination;
        } else {
            NavGraph parent = navDestination.getParent();
            Intrinsics.checkNotNull(parent);
            navGraph = parent;
        }
        return navGraph.T(i2, navGraph, z2, navDestination2);
    }

    public final NavBackStackEntry eWT(NavBackStackEntry child) {
        Intrinsics.checkNotNullParameter(child, "child");
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.childToParentEntries.remove(child);
        if (navBackStackEntry == null) {
            return null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) this.parentToChildCount.get(navBackStackEntry);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.navigatorState.get(this._navigatorProvider.O(navBackStackEntry.getDestination().getNavigatorName()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.O(navBackStackEntry);
            }
            this.parentToChildCount.remove(navBackStackEntry);
        }
        return navBackStackEntry;
    }

    /* JADX INFO: renamed from: fD, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public void fcU(ViewModelStore viewModelStore) {
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        NavControllerViewModel navControllerViewModel = this.viewModel;
        NavControllerViewModel.Companion companion = NavControllerViewModel.INSTANCE;
        if (Intrinsics.areEqual(navControllerViewModel, companion.n(viewModelStore))) {
            return;
        }
        if (!this.backQueue.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.viewModel = companion.n(viewModelStore);
    }

    public final NavBackStackEntry iF(String route) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(route, "route");
        ArrayDeque arrayDeque = this.backQueue;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            if (navBackStackEntry.getDestination().r(route, navBackStackEntry.t())) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        throw new IllegalArgumentException(("No destination with route " + route + " is on the NavController's back stack. The current destination is " + e()).toString());
    }

    public final List ijL() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((NavControllerNavigatorState) it.next()).getTransitionsInProgress().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && !navBackStackEntry.getMaxLifecycle().rl(Lifecycle.State.J2)) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        ArrayDeque arrayDeque = this.backQueue;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayDeque) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) obj2;
            if (!arrayList.contains(navBackStackEntry2) && navBackStackEntry2.getMaxLifecycle().rl(Lifecycle.State.J2)) {
                arrayList3.add(obj2);
            }
        }
        CollectionsKt.addAll(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((NavBackStackEntry) obj3).getDestination() instanceof NavGraph)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public void m(Bundle navState) {
        if (navState == null) {
            return;
        }
        navState.setClassLoader(this.context.getClassLoader());
        this.navigatorStateToRestore = navState.getBundle("android-support-nav:controller:navigatorState");
        this.backStackToRestore = navState.getParcelableArray("android-support-nav:controller:backStack");
        this.backStackStates.clear();
        int[] intArray = navState.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = navState.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                this.backStackMap.put(Integer.valueOf(intArray[i2]), stringArrayList.get(i3));
                i2++;
                i3++;
            }
        }
        ArrayList<String> stringArrayList2 = navState.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String id : stringArrayList2) {
                Parcelable[] parcelableArray = navState.getParcelableArray("android-support-nav:controller:backStackStates:" + id);
                if (parcelableArray != null) {
                    Map map = this.backStackStates;
                    Intrinsics.checkNotNullExpressionValue(id, "id");
                    ArrayDeque arrayDeque = new ArrayDeque(parcelableArray.length);
                    Iterator it = ArrayIteratorKt.iterator(parcelableArray);
                    while (it.hasNext()) {
                        Parcelable parcelable = (Parcelable) it.next();
                        Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        arrayDeque.add((NavBackStackEntryState) parcelable);
                    }
                    map.put(id, arrayDeque);
                }
            }
        }
        this.deepLinkHandled = navState.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public NavInflater nHg() {
        return (NavInflater) this.navInflater.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p5(int resId, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        int destinationId;
        Bundle bundle;
        NavDestination destination = this.backQueue.isEmpty() ? this._graph : ((NavBackStackEntry) this.backQueue.last()).getDestination();
        if (destination == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        NavAction navActionMUb = destination.mUb(resId);
        if (navActionMUb != null) {
            if (navOptions == null) {
                navOptions = navActionMUb.getNavOptions();
            }
            destinationId = navActionMUb.getDestinationId();
            Bundle defaultArguments = navActionMUb.getDefaultArguments();
            if (defaultArguments != null) {
                bundle = new Bundle();
                bundle.putAll(defaultArguments);
            }
            if (args != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putAll(args);
            }
            if (destinationId != 0 && navOptions != null && (navOptions.getPopUpToId() != -1 || navOptions.getPopUpToRoute() != null || navOptions.getPopUpToRouteClass() != null)) {
                if (navOptions.getPopUpToRoute() != null) {
                    String popUpToRoute = navOptions.getPopUpToRoute();
                    Intrinsics.checkNotNull(popUpToRoute);
                    a(this, popUpToRoute, navOptions.getPopUpToInclusive(), false, 4, null);
                    return;
                } else if (navOptions.getPopUpToRouteClass() != null) {
                    KClass popUpToRouteClass = navOptions.getPopUpToRouteClass();
                    Intrinsics.checkNotNull(popUpToRouteClass);
                    B(RouteSerializerKt.Uo(XA.r.t(popUpToRouteClass)), navOptions.getPopUpToInclusive());
                    return;
                } else {
                    if (navOptions.getPopUpToId() != -1) {
                        B(navOptions.getPopUpToId(), navOptions.getPopUpToInclusive());
                        return;
                    }
                    return;
                }
            }
            if (destinationId != 0) {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            }
            NavDestination navDestinationWPU = WPU(this, destinationId, null, 2, null);
            if (navDestinationWPU != null) {
                eF(navDestinationWPU, bundle, navOptions, navigatorExtras);
                return;
            }
            NavDestination.Companion companion = NavDestination.INSTANCE;
            String strRl = companion.rl(this.context, destinationId);
            if (navActionMUb == null) {
                throw new IllegalArgumentException("Navigation action/destination " + strRl + " cannot be found from the current destination " + destination);
            }
            throw new IllegalArgumentException(("Navigation destination " + strRl + " referenced from action " + companion.rl(this.context, resId) + " cannot be found from the current destination " + destination).toString());
        }
        destinationId = resId;
        bundle = null;
        if (args != null) {
        }
        if (destinationId != 0) {
        }
        if (destinationId != 0) {
        }
    }

    public boolean rV9(Intent intent) {
        int[] intArray;
        NavGraph navGraphWTp;
        NavDestination.DeepLinkMatch deepLinkMatchRV9;
        NavDestination navDestinationE2;
        NavGraph navGraph;
        Bundle bundle;
        int i2 = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                intArray = extras.getIntArray(obbPUqyhtS.KwrpvgDudlyeD);
            } catch (Exception e2) {
                Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e2);
                intArray = null;
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if ((intArray == null || intArray.length == 0) && (deepLinkMatchRV9 = (navGraphWTp = wTp(this.backQueue)).rV9(new NavDeepLinkRequest(intent), true, true, navGraphWTp)) != null) {
            NavDestination destination = deepLinkMatchRV9.getDestination();
            int[] iArrXMQ = NavDestination.xMQ(destination, null, 1, null);
            Bundle bundleUo = destination.Uo(deepLinkMatchRV9.getMatchingArgs());
            if (bundleUo != null) {
                bundle2.putAll(bundleUo);
            }
            intArray = iArrXMQ;
            parcelableArrayList = null;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strNY = nY(intArray);
        if (strNY != null) {
            Log.i("NavController", "Could not find destination " + strNY + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int length = intArray.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i3 = 0; i3 < length; i3++) {
            Bundle bundle4 = new Bundle();
            bundle4.putAll(bundle2);
            if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i3)) != null) {
                bundle4.putAll(bundle);
            }
            bundleArr[i3] = bundle4;
        }
        int flags = intent.getFlags();
        int i5 = 268435456 & flags;
        if (i5 != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            TaskStackBuilder taskStackBuilderT = TaskStackBuilder.J2(this.context).t(intent);
            Intrinsics.checkNotNullExpressionValue(taskStackBuilderT, "create(context).addNextI…ntWithParentStack(intent)");
            taskStackBuilderT.Uo();
            Activity activity = this.activity;
            if (activity != null) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            return true;
        }
        if (i5 != 0) {
            if (!this.backQueue.isEmpty()) {
                NavGraph navGraph2 = this._graph;
                Intrinsics.checkNotNull(navGraph2);
                dR0(this, navGraph2.getId(), true, false, 4, null);
            }
            while (i2 < intArray.length) {
                int i7 = intArray[i2];
                int i8 = i2 + 1;
                Bundle bundle5 = bundleArr[i2];
                final NavDestination navDestinationWPU = WPU(this, i7, null, 2, null);
                if (navDestinationWPU == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.INSTANCE.rl(this.context, i7) + " cannot be found from the current destination " + e());
                }
                eF(navDestinationWPU, bundle5, NavOptionsBuilderKt.n(new Function1<NavOptionsBuilder, Unit>() { // from class: androidx.navigation.NavController$handleDeepLink$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder navOptionsBuilder) {
                        n(navOptionsBuilder);
                        return Unit.INSTANCE;
                    }

                    public final void n(NavOptionsBuilder navOptions) {
                        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                        navOptions.n(new Function1<AnimBuilder, Unit>() { // from class: androidx.navigation.NavController$handleDeepLink$2.1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AnimBuilder animBuilder) {
                                n(animBuilder);
                                return Unit.INSTANCE;
                            }

                            public final void n(AnimBuilder anim) {
                                Intrinsics.checkNotNullParameter(anim, "$this$anim");
                                anim.O(0);
                                anim.J2(0);
                            }
                        });
                        NavDestination navDestination = navDestinationWPU;
                        if (navDestination instanceof NavGraph) {
                            Sequence<NavDestination> sequenceT = NavDestination.INSTANCE.t(navDestination);
                            NavController navController = this;
                            for (NavDestination navDestination2 : sequenceT) {
                                NavDestination navDestinationE = navController.e();
                                if (Intrinsics.areEqual(navDestination2, navDestinationE != null ? navDestinationE.getParent() : null)) {
                                    return;
                                }
                            }
                            if (NavController.f40012N) {
                                navOptions.t(NavGraph.INSTANCE.rl(this.T()).getId(), new Function1<PopUpToBuilder, Unit>() { // from class: androidx.navigation.NavController$handleDeepLink$2.2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(PopUpToBuilder popUpToBuilder) {
                                        n(popUpToBuilder);
                                        return Unit.INSTANCE;
                                    }

                                    public final void n(PopUpToBuilder popUpTo) {
                                        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                                        popUpTo.t(true);
                                    }
                                });
                            }
                        }
                    }
                }), null);
                i2 = i8;
            }
            this.deepLinkHandled = true;
            return true;
        }
        NavGraph navGraph3 = this._graph;
        int length2 = intArray.length;
        for (int i9 = 0; i9 < length2; i9++) {
            int i10 = intArray[i9];
            Bundle bundle6 = bundleArr[i9];
            if (i9 == 0) {
                navDestinationE2 = this._graph;
            } else {
                Intrinsics.checkNotNull(navGraph3);
                navDestinationE2 = navGraph3.E2(i10);
            }
            if (navDestinationE2 == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.INSTANCE.rl(this.context, i10) + " cannot be found in graph " + navGraph3);
            }
            if (i9 == intArray.length - 1) {
                NavOptions.Builder builder = new NavOptions.Builder();
                NavGraph navGraph4 = this._graph;
                Intrinsics.checkNotNull(navGraph4);
                eF(navDestinationE2, bundle6, NavOptions.Builder.gh(builder, navGraph4.getId(), true, false, 4, null).rl(0).t(0).n(), null);
            } else if (navDestinationE2 instanceof NavGraph) {
                while (true) {
                    navGraph = (NavGraph) navDestinationE2;
                    Intrinsics.checkNotNull(navGraph);
                    if (!(navGraph.E2(navGraph.getStartDestId()) instanceof NavGraph)) {
                        break;
                    }
                    navDestinationE2 = navGraph.E2(navGraph.getStartDestId());
                }
                navGraph3 = navGraph;
            }
        }
        this.deepLinkHandled = true;
        return true;
    }

    /* JADX INFO: renamed from: s7N, reason: from getter */
    public NavigatorProvider get_navigatorProvider() {
        return this._navigatorProvider;
    }

    public NavBackStackEntry te(int destinationId) {
        Object objPrevious;
        ArrayDeque arrayDeque = this.backQueue;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((NavBackStackEntry) objPrevious).getDestination().getId() == destinationId) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        throw new IllegalArgumentException(("No destination with ID " + destinationId + " is on the NavController's back stack. The current destination is " + e()).toString());
    }

    public final void ul() {
        AtomicInteger atomicInteger;
        rv6 rv6VarT;
        Set set;
        List<NavBackStackEntry> mutableList = CollectionsKt.toMutableList((Collection) this.backQueue);
        if (mutableList.isEmpty()) {
            return;
        }
        NavDestination destination = ((NavBackStackEntry) CollectionsKt.last(mutableList)).getDestination();
        ArrayList arrayList = new ArrayList();
        if (destination instanceof FloatingWindow) {
            Iterator it = CollectionsKt.reversed(mutableList).iterator();
            while (it.hasNext()) {
                NavDestination destination2 = ((NavBackStackEntry) it.next()).getDestination();
                arrayList.add(destination2);
                if (!(destination2 instanceof FloatingWindow) && !(destination2 instanceof NavGraph)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (NavBackStackEntry navBackStackEntry : CollectionsKt.reversed(mutableList)) {
            Lifecycle.State maxLifecycle = navBackStackEntry.getMaxLifecycle();
            NavDestination destination3 = navBackStackEntry.getDestination();
            if (destination != null && destination3.getId() == destination.getId()) {
                Lifecycle.State state = Lifecycle.State.f38884r;
                if (maxLifecycle != state) {
                    NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.navigatorState.get(get_navigatorProvider().O(navBackStackEntry.getDestination().getNavigatorName()));
                    if (Intrinsics.areEqual((navControllerNavigatorState == null || (rv6VarT = navControllerNavigatorState.getTransitionsInProgress()) == null || (set = (Set) rv6VarT.getValue()) == null) ? null : Boolean.valueOf(set.contains(navBackStackEntry)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.parentToChildCount.get(navBackStackEntry)) != null && atomicInteger.get() == 0)) {
                        map.put(navBackStackEntry, Lifecycle.State.J2);
                    } else {
                        map.put(navBackStackEntry, state);
                    }
                }
                NavDestination navDestination = (NavDestination) CollectionsKt.firstOrNull((List) arrayList);
                if (navDestination != null && navDestination.getId() == destination3.getId()) {
                    CollectionsKt.removeFirst(arrayList);
                }
                destination = destination.getParent();
            } else if (arrayList.isEmpty() || destination3.getId() != ((NavDestination) CollectionsKt.first((List) arrayList)).getId()) {
                navBackStackEntry.gh(Lifecycle.State.f38880O);
            } else {
                NavDestination navDestination2 = (NavDestination) CollectionsKt.removeFirst(arrayList);
                if (maxLifecycle == Lifecycle.State.f38884r) {
                    navBackStackEntry.gh(Lifecycle.State.J2);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.J2;
                    if (maxLifecycle != state2) {
                        map.put(navBackStackEntry, state2);
                    }
                }
                NavGraph parent = navDestination2.getParent();
                if (parent != null && !arrayList.contains(parent)) {
                    arrayList.add(parent);
                }
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : mutableList) {
            Lifecycle.State state3 = (Lifecycle.State) map.get(navBackStackEntry2);
            if (state3 != null) {
                navBackStackEntry2.gh(state3);
            } else {
                navBackStackEntry2.qie();
            }
        }
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final rv6 getVisibleEntries() {
        return this.visibleEntries;
    }

    public Bundle xg() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this._navigatorProvider.J2().entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleXMQ = ((Navigator) entry.getValue()).xMQ();
            if (bundleXMQ != null) {
                arrayList.add(str);
                bundle2.putBundle(str, bundleXMQ);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!this.backQueue.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.backQueue.size()];
            Iterator<E> it = this.backQueue.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                parcelableArr[i2] = new NavBackStackEntryState((NavBackStackEntry) it.next());
                i2++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i3 = 0;
            for (Map.Entry entry2 : this.backStackMap.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                iArr[i3] = iIntValue;
                arrayList2.add(str2);
                i3++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : this.backStackStates.entrySet()) {
                String str3 = (String) entry3.getKey();
                ArrayDeque arrayDeque = (ArrayDeque) entry3.getValue();
                arrayList3.add(str3);
                Parcelable[] parcelableArr2 = new Parcelable[arrayDeque.size()];
                int i5 = 0;
                for (Object obj : arrayDeque) {
                    int i7 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    parcelableArr2[i5] = (NavBackStackEntryState) obj;
                    i5 = i7;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str3, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.deepLinkHandled) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.deepLinkHandled);
        }
        return bundle;
    }

    private final boolean Xw(NavDestination node, Bundle args) {
        int iNextIndex;
        NavDestination destination;
        NavBackStackEntry navBackStackEntryE2 = E2();
        ArrayDeque arrayDeque = this.backQueue;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((NavBackStackEntry) listIterator.previous()).getDestination() == node) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex = -1;
                break;
            }
        }
        if (iNextIndex == -1) {
            return false;
        }
        if (node instanceof NavGraph) {
            List list = SequencesKt.toList(SequencesKt.map(NavGraph.INSTANCE.n((NavGraph) node), new Function1<NavDestination, Integer>() { // from class: androidx.navigation.NavController$launchSingleTopInternal$childHierarchyId$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Integer invoke(NavDestination it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Integer.valueOf(it.getId());
                }
            }));
            if (this.backQueue.size() - iNextIndex != list.size()) {
                return false;
            }
            ArrayDeque arrayDeque2 = this.backQueue;
            Collection collectionSubList = arrayDeque2.subList(iNextIndex, arrayDeque2.size());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionSubList, 10));
            Iterator it = collectionSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((NavBackStackEntry) it.next()).getDestination().getId()));
            }
            if (!Intrinsics.areEqual(arrayList, list)) {
                return false;
            }
        } else if (navBackStackEntryE2 == null || (destination = navBackStackEntryE2.getDestination()) == null || node.getId() != destination.getId()) {
            return false;
        }
        ArrayDeque<NavBackStackEntry> arrayDeque3 = new ArrayDeque();
        while (CollectionsKt.getLastIndex(this.backQueue) >= iNextIndex) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.removeLast(this.backQueue);
            eWT(navBackStackEntry);
            arrayDeque3.addFirst(new NavBackStackEntry(navBackStackEntry, navBackStackEntry.getDestination().Uo(args)));
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayDeque3) {
            NavGraph parent = navBackStackEntry2.getDestination().getParent();
            if (parent != null) {
                U(navBackStackEntry2, te(parent.getId()));
            }
            this.backQueue.add(navBackStackEntry2);
        }
        for (NavBackStackEntry navBackStackEntry3 : arrayDeque3) {
            this._navigatorProvider.O(navBackStackEntry3.getDestination().getNavigatorName()).Uo(navBackStackEntry3);
        }
        return true;
    }

    private final boolean Y(Object route, boolean inclusive, boolean saveState) {
        return k(g(route), inclusive, saveState);
    }

    private final String g(Object route) {
        NavDestination navDestinationViF = ViF(this, T(), RouteSerializerKt.Uo(XA.r.t(Reflection.getOrCreateKotlinClass(route.getClass()))), true, null, 4, null);
        if (navDestinationViF != null) {
            Map mapGh = navDestinationViF.gh();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapGh.size()));
            for (Map.Entry entry : mapGh.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
            }
            return RouteSerializerKt.gh(route, linkedHashMap);
        }
        throw new IllegalArgumentException(("Destination with route " + Reflection.getOrCreateKotlinClass(route.getClass()).getSimpleName() + " cannot be found in navigation graph " + this._graph).toString());
    }

    private final NavGraph wTp(ArrayDeque arrayDeque) {
        NavDestination destination;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) arrayDeque.lastOrNull();
        if (navBackStackEntry == null || (destination = navBackStackEntry.getDestination()) == null) {
            destination = this._graph;
            Intrinsics.checkNotNull(destination);
        }
        if (destination instanceof NavGraph) {
            return (NavGraph) destination;
        }
        NavGraph parent = destination.getParent();
        Intrinsics.checkNotNull(parent);
        return parent;
    }

    public boolean J(int destinationId, boolean inclusive, boolean saveState) {
        if (Nxk(destinationId, inclusive, saveState) && o()) {
            return true;
        }
        return false;
    }

    public NavDestination e() {
        NavBackStackEntry navBackStackEntryE2 = E2();
        if (navBackStackEntryE2 != null) {
            return navBackStackEntryE2.getDestination();
        }
        return null;
    }

    public void ofS(int graphResId, Bundle startDestinationArgs) {
        Mx(nHg().rl(graphResId), startDestinationArgs);
    }

    public void pJg(int graphResId) {
        Mx(nHg().rl(graphResId), null);
    }
}
