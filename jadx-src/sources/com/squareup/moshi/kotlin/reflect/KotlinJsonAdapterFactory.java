package com.squareup.moshi.kotlin.reflect;

import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInObject;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi._MoshiKotlinTypesExtensionsKt;
import com.squareup.moshi.internal.Util;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.KCallablesJvm;
import kotlin.reflect.jvm.ReflectJvmMapping;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "()V", V8ValueBuiltInObject.FUNCTION_CREATE, "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKotlinJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinJsonAdapter.kt\ncom/squareup/moshi/kotlin/reflect/KotlinJsonAdapterFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,328:1\n1194#2,2:329\n1222#2,4:331\n288#2,2:336\n288#2,2:339\n1603#2,9:342\n1855#2:351\n1856#2:353\n1612#2:354\n1549#2:359\n1620#2,3:360\n20#3:335\n20#3:338\n1#4:341\n1#4:352\n37#5,2:355\n37#5,2:357\n37#5,2:363\n*S KotlinDebug\n*F\n+ 1 KotlinJsonAdapter.kt\ncom/squareup/moshi/kotlin/reflect/KotlinJsonAdapterFactory\n*L\n229#1:329,2\n229#1:331,4\n238#1:336,2\n244#1:339,2\n278#1:342,9\n278#1:351\n278#1:353\n278#1:354\n324#1:359\n324#1:360,3\n238#1:335\n244#1:338\n278#1:352\n278#1:355,2\n294#1:357,2\n324#1:363,2\n*E\n"})
public final class KotlinJsonAdapterFactory implements JsonAdapter.Factory {
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b7  */
    @Override // com.squareup.moshi.JsonAdapter.Factory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonAdapter<?> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
        Object next;
        String name;
        KClassifier classifier;
        Type javaType;
        Object next2;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Object obj = null;
        if (!annotations.isEmpty()) {
            return null;
        }
        Class<?> rawType = _MoshiKotlinTypesExtensionsKt.getRawType(type);
        if (rawType.isInterface() || rawType.isEnum() || !rawType.isAnnotationPresent(KotlinJsonAdapterKt.KOTLIN_METADATA) || Util.isPlatformType(rawType)) {
            return null;
        }
        try {
            JsonAdapter<?> jsonAdapterGeneratedAdapter = Util.generatedAdapter(moshi, type, rawType);
            if (jsonAdapterGeneratedAdapter != null) {
                return jsonAdapterGeneratedAdapter;
            }
        } catch (RuntimeException e2) {
            if (!(e2.getCause() instanceof ClassNotFoundException)) {
                throw e2;
            }
        }
        if (rawType.isLocalClass()) {
            throw new IllegalArgumentException(("Cannot serialize local class or object expression " + rawType.getName()).toString());
        }
        KClass kotlinClass = JvmClassMappingKt.getKotlinClass(rawType);
        if (kotlinClass.isAbstract()) {
            throw new IllegalArgumentException(("Cannot serialize abstract class " + rawType.getName()).toString());
        }
        if (kotlinClass.isInner()) {
            throw new IllegalArgumentException(("Cannot serialize inner class " + rawType.getName()).toString());
        }
        if (kotlinClass.getObjectInstance() != null) {
            throw new IllegalArgumentException(("Cannot serialize object declaration " + rawType.getName()).toString());
        }
        if (kotlinClass.isSealed()) {
            throw new IllegalArgumentException(("Cannot reflectively serialize sealed class " + rawType.getName() + ". Please register an adapter.").toString());
        }
        KFunction primaryConstructor = KClasses.getPrimaryConstructor(kotlinClass);
        if (primaryConstructor == null) {
            return null;
        }
        List<KParameter> parameters = primaryConstructor.getParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(parameters, 10)), 16));
        for (Object obj2 : parameters) {
            linkedHashMap.put(((KParameter) obj2).getName(), obj2);
        }
        boolean z2 = true;
        KCallablesJvm.setAccessible(primaryConstructor, true);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (KProperty1 kProperty1 : KClasses.getMemberProperties(kotlinClass)) {
            KParameter kParameter = (KParameter) linkedHashMap.get(kProperty1.getName());
            KCallablesJvm.setAccessible(kProperty1, z2);
            Iterator<T> it = kProperty1.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = obj;
                    break;
                }
                next = it.next();
                if (((Annotation) next) instanceof Json) {
                    break;
                }
            }
            Json json = (Json) next;
            List mutableList = CollectionsKt.toMutableList((Collection) kProperty1.getAnnotations());
            if (kParameter != null) {
                CollectionsKt.addAll(mutableList, kParameter.getAnnotations());
                if (json == null) {
                    Iterator<T> it2 = kParameter.getAnnotations().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (((Annotation) next2) instanceof Json) {
                            break;
                        }
                    }
                    json = (Json) next2;
                }
            }
            Field javaField = ReflectJvmMapping.getJavaField(kProperty1);
            if (Modifier.isTransient(javaField != null ? javaField.getModifiers() : 0)) {
                if (kParameter != null && !kParameter.isOptional()) {
                    throw new IllegalArgumentException(("No default value for transient constructor " + kParameter).toString());
                }
            } else if (json == null || json.ignore() != z2) {
                if (kParameter != null && !Intrinsics.areEqual(kParameter.getType(), kProperty1.getReturnType())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('\'');
                    sb.append(kProperty1.getName());
                    sb.append("' has a constructor parameter of type ");
                    Intrinsics.checkNotNull(kParameter);
                    sb.append(kParameter.getType());
                    sb.append(" but a property of type ");
                    sb.append(kProperty1.getReturnType());
                    sb.append('.');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                if ((kProperty1 instanceof KMutableProperty1) || kParameter != null) {
                    if (json == null || (name = json.name()) == null) {
                        name = kProperty1.getName();
                        String str = name;
                        classifier = kProperty1.getReturnType().getClassifier();
                        if (!(classifier instanceof KClass)) {
                            KClass kClass = (KClass) classifier;
                            if (kClass.isValue()) {
                                javaType = JvmClassMappingKt.getJavaClass(kClass);
                                if (!kProperty1.getReturnType().getArguments().isEmpty()) {
                                    List<KTypeProjection> arguments = kProperty1.getReturnType().getArguments();
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<T> it3 = arguments.iterator();
                                    while (it3.hasNext()) {
                                        KType type2 = ((KTypeProjection) it3.next()).getType();
                                        Type javaType2 = type2 != null ? ReflectJvmMapping.getJavaType(type2) : null;
                                        if (javaType2 != null) {
                                            arrayList.add(javaType2);
                                        }
                                    }
                                    Type[] typeArr = (Type[]) arrayList.toArray(new Type[0]);
                                    javaType = Types.newParameterizedType(javaType, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
                                }
                            } else {
                                javaType = ReflectJvmMapping.getJavaType(kProperty1.getReturnType());
                            }
                        } else {
                            if (!(classifier instanceof KTypeParameter)) {
                                throw new IllegalStateException("Not possible!");
                            }
                            javaType = ReflectJvmMapping.getJavaType(kProperty1.getReturnType());
                        }
                        JsonAdapter adapter = moshi.adapter(Util.resolve(type, rawType, javaType), Util.jsonAnnotations((Annotation[]) mutableList.toArray(new Annotation[0])), kProperty1.getName());
                        String name2 = kProperty1.getName();
                        Intrinsics.checkNotNullExpressionValue(adapter, "adapter");
                        Intrinsics.checkNotNull(kProperty1, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Any, kotlin.Any?>");
                        linkedHashMap2.put(name2, new KotlinJsonAdapter.Binding(str, adapter, kProperty1, kParameter, kParameter == null ? kParameter.getIndex() : -1));
                        obj = null;
                        z2 = true;
                    } else {
                        if (Intrinsics.areEqual(name, Json.UNSET_NAME)) {
                            name = null;
                        }
                        if (name == null) {
                        }
                        String str2 = name;
                        classifier = kProperty1.getReturnType().getClassifier();
                        if (!(classifier instanceof KClass)) {
                        }
                        JsonAdapter adapter2 = moshi.adapter(Util.resolve(type, rawType, javaType), Util.jsonAnnotations((Annotation[]) mutableList.toArray(new Annotation[0])), kProperty1.getName());
                        String name22 = kProperty1.getName();
                        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter");
                        Intrinsics.checkNotNull(kProperty1, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Any, kotlin.Any?>");
                        linkedHashMap2.put(name22, new KotlinJsonAdapter.Binding(str2, adapter2, kProperty1, kParameter, kParameter == null ? kParameter.getIndex() : -1));
                        obj = null;
                        z2 = true;
                    }
                }
            } else if (kParameter != null && !kParameter.isOptional()) {
                throw new IllegalArgumentException(("No default value for ignored constructor " + kParameter).toString());
            }
            obj = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (KParameter kParameter2 : primaryConstructor.getParameters()) {
            KotlinJsonAdapter.Binding binding = (KotlinJsonAdapter.Binding) TypeIntrinsics.asMutableMap(linkedHashMap2).remove(kParameter2.getName());
            if (binding == null && !kParameter2.isOptional()) {
                throw new IllegalArgumentException(("No property for required constructor " + kParameter2).toString());
            }
            arrayList2.add(binding);
        }
        int size = arrayList2.size();
        Iterator it4 = linkedHashMap2.entrySet().iterator();
        while (true) {
            int i2 = size;
            if (!it4.hasNext()) {
                break;
            }
            size = i2 + 1;
            arrayList2.add(KotlinJsonAdapter.Binding.copy$default((KotlinJsonAdapter.Binding) ((Map.Entry) it4.next()).getValue(), null, null, null, null, i2, 15, null));
        }
        List listFilterNotNull = CollectionsKt.filterNotNull(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterNotNull, 10));
        Iterator it5 = listFilterNotNull.iterator();
        while (it5.hasNext()) {
            arrayList3.add(((KotlinJsonAdapter.Binding) it5.next()).getJsonName());
        }
        String[] strArr = (String[]) arrayList3.toArray(new String[0]);
        JsonReader.Options options = JsonReader.Options.of((String[]) Arrays.copyOf(strArr, strArr.length));
        Intrinsics.checkNotNullExpressionValue(options, "options");
        return new KotlinJsonAdapter(primaryConstructor, arrayList2, listFilterNotNull, options).nullSafe();
    }
}
