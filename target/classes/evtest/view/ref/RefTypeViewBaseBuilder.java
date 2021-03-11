package evtest.view.ref;

import com.blazebit.persistence.view.EntityViewBuilder;
import com.blazebit.persistence.view.EntityViewBuilderBase;
import com.blazebit.persistence.view.EntityViewBuilderListener;
import com.blazebit.persistence.view.EntityViewNestedBuilder;
import com.blazebit.persistence.view.RecordingContainer;
import com.blazebit.persistence.view.StaticBuilder;
import com.blazebit.persistence.view.metamodel.Attribute;
import com.blazebit.persistence.view.metamodel.CollectionAttribute;
import com.blazebit.persistence.view.metamodel.ListAttribute;
import com.blazebit.persistence.view.metamodel.MapAttribute;
import com.blazebit.persistence.view.metamodel.MethodAttribute;
import com.blazebit.persistence.view.metamodel.ParameterAttribute;
import com.blazebit.persistence.view.metamodel.PluralAttribute;
import com.blazebit.persistence.view.metamodel.SetAttribute;
import com.blazebit.persistence.view.metamodel.SingularAttribute;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "com.blazebit.persistence.view.processor.EntityViewAnnotationProcessor")
@StaticBuilder(RefTypeViewBase.class)
public abstract class RefTypeViewBaseBuilder<BuilderType extends EntityViewBuilderBase<RefTypeViewBase, BuilderType>> implements EntityViewBuilderBase<RefTypeViewBase, BuilderType> {

    protected Long id;
    protected final Map<String, Object> optionalParameters;

    public RefTypeViewBaseBuilder(Map<String, Object> optionalParameters) {
        this.id = null;
        this.optionalParameters = optionalParameters;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public BuilderType withId(Long id) {
        this.id = id;
        return (BuilderType) this;
    }

    protected <E> E get(Attribute<?, ?> attr) {
        if (attr instanceof MethodAttribute) {
            return get(((MethodAttribute) attr).getName());
        } else {
            return get(((ParameterAttribute) attr).getIndex());
        }
    }

    protected BuilderType with(Attribute<?, ?> attr, Object value) {
        if (attr instanceof MethodAttribute) {
            return with(((MethodAttribute) attr).getName(), value);
        } else {
            return with(((ParameterAttribute) attr).getIndex(), value);
        }
    }

    protected <A extends Collection<Object>> A getCollection(Attribute<?, ?> attr) {
        if (attr instanceof MethodAttribute) {
            return getCollection(((MethodAttribute) attr).getName());
        } else {
            return getCollection(((ParameterAttribute) attr).getIndex());
        }
    }

    protected <A extends Map<Object, Object>> A getMap(Attribute<?, ?> attr) {
        if (attr instanceof MethodAttribute) {
            return getMap(((MethodAttribute) attr).getName());
        } else {
            return getMap(((ParameterAttribute) attr).getIndex());
        }
    }

    protected <A extends Collection<Object>> A getCollection(String attr) {
        Object currentValue = get(attr);
        if (currentValue == null) {
            with(attr, null);
            currentValue = get(attr);
        }
        if (currentValue instanceof RecordingContainer<?>) {
            return (A) ((RecordingContainer<?>) currentValue).getDelegate();
        } else {
            return (A) currentValue;
        }
    }

    protected <A extends Map<Object, Object>> A getMap(String attr) {
        Object currentValue = get(attr);
        if (currentValue == null) {
            with(attr, null);
            currentValue = get(attr);
        }
        if (currentValue instanceof RecordingContainer<?>) {
            return (A) ((RecordingContainer<?>) currentValue).getDelegate();
        } else {
            return (A) currentValue;
        }
    }

    protected <A extends Collection<Object>> A getCollection(int attr) {
        Object currentValue = get(attr);
        if (currentValue == null) {
            with(attr, null);
            currentValue = get(attr);
        }
        if (currentValue instanceof RecordingContainer<?>) {
            return (A) ((RecordingContainer<?>) currentValue).getDelegate();
        } else {
            return (A) currentValue;
        }
    }

    protected <A extends Map<Object, Object>> A getMap(int attr) {
        Object currentValue = get(attr);
        if (currentValue == null) {
            with(attr, null);
            currentValue = get(attr);
        }
        if (currentValue instanceof RecordingContainer<?>) {
            return (A) ((RecordingContainer<?>) currentValue).getDelegate();
        } else {
            return (A) currentValue;
        }
    }

    protected void addListValue(List<Object> list, int index, Object value) {
        if (index > list.size()) {
            for (int i = list.size(); i < index; i++) {
                list.add(null);
            }
            list.add(value);
        } else if (index < list.size()) {
            list.set(index, value);
        } else {
            list.add(value);
        }
    }

    @Override
    public BuilderType with(String attribute, Object value) {
        switch (attribute) {
            case "id":
                this.id = value == null ? null : (Long) value;
                break;
            default:
                throw new IllegalArgumentException("Unknown attribute: " + attribute);
        }
        return (BuilderType) this;
    }

    @Override
    public <E> BuilderType with(SingularAttribute<RefTypeViewBase, E> attribute, E value) {
        return with((Attribute<?, ?>) attribute, value);
    }

    @Override
    public <C> BuilderType with(PluralAttribute<RefTypeViewBase, C, ?> attribute, C value) {
        return with((Attribute<?, ?>) attribute, value);
    }

    @Override
    public <E> E get(String attribute) {
        switch (attribute) {
            case "id":
                return (E) (Object) this.id;
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <E> E get(SingularAttribute<RefTypeViewBase, E> attribute) {
        return get((Attribute<?, ?>) attribute);
    }

    @Override
    public <C> C get(PluralAttribute<RefTypeViewBase, C, ?> attribute) {
        return get((Attribute<?, ?>) attribute);
    }

    @Override
    public BuilderType withElement(String attribute, Object value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public BuilderType withElement(int parameterIndex, Object value) {
        getCollection(parameterIndex).add(value);
        return (BuilderType) this;
    }

    @Override
    public BuilderType withListElement(String attribute, int index, Object value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (BuilderType) this;
    }

    @Override
    public BuilderType withListElement(int parameterIndex, int index, Object value) {
        List<Object> list = getCollection(parameterIndex);
        addListValue(list, index, value);
        return (BuilderType) this;
    }

    @Override
    public BuilderType withEntry(String attribute, Object key, Object value) {
        Map<Object, Object> map = getMap(attribute);
        map.put(key, value);
        return (BuilderType) this;
    }

    @Override
    public BuilderType withEntry(int parameterIndex, Object key, Object value) {
        Map<Object, Object> map = getMap(parameterIndex);
        map.put(key, value);
        return (BuilderType) this;
    }

    @Override
    public <E> BuilderType withElement(CollectionAttribute<RefTypeViewBase, E> attribute, E value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public <E> BuilderType withElement(SetAttribute<RefTypeViewBase, E> attribute, E value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public <E> BuilderType withElement(ListAttribute<RefTypeViewBase, E> attribute, E value) {
        getCollection(attribute).add(value);
        return (BuilderType) this;
    }

    @Override
    public <E> BuilderType withListElement(ListAttribute<RefTypeViewBase, E> attribute, int index, E value) {
        List<Object> list = getCollection(attribute);
        addListValue(list, index, value);
        return (BuilderType) this;
    }

    @Override
    public <K, V> BuilderType withEntry(MapAttribute<RefTypeViewBase, K, V> attribute, K key, V value) {
        Map<Object, Object> map = getMap(attribute);
        map.put(key, value);
        return (BuilderType) this;
    }

    @Override
    public <E> EntityViewNestedBuilder<E, BuilderType> withSingularBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <E> EntityViewNestedBuilder<E, BuilderType> withCollectionBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <E> EntityViewNestedBuilder<E, BuilderType> withListBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <E> EntityViewNestedBuilder<E, BuilderType> withListBuilder(String attribute, int index) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <E> EntityViewNestedBuilder<E, BuilderType> withSetBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <V> EntityViewNestedBuilder<V, BuilderType> withMapBuilder(String attribute, Object key) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <K, V> EntityViewNestedBuilder<K, EntityViewNestedBuilder<V, BuilderType>> withMapBuilder(String attribute) {
        switch (attribute) {
        }
        throw new IllegalArgumentException("Unknown attribute: " + attribute);
    }

    @Override
    public <E> EntityViewNestedBuilder<E, BuilderType> withBuilder(SingularAttribute<RefTypeViewBase, E> attr) {
        if (attr instanceof MethodAttribute) {
            return withSingularBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSingularBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <E> EntityViewNestedBuilder<E, BuilderType> withBuilder(CollectionAttribute<RefTypeViewBase, E> attr) {
        if (attr instanceof MethodAttribute) {
            return withCollectionBuilder(((MethodAttribute) attr).getName());
        } else {
            return withCollectionBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <E> EntityViewNestedBuilder<E, BuilderType> withBuilder(ListAttribute<RefTypeViewBase, E> attr) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName());
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <E> EntityViewNestedBuilder<E, BuilderType> withBuilder(ListAttribute<RefTypeViewBase, E> attr, int index) {
        if (attr instanceof MethodAttribute) {
            return withListBuilder(((MethodAttribute) attr).getName(), index);
        } else {
            return withListBuilder(((ParameterAttribute) attr).getIndex(), index);
        }
    }

    @Override
    public <E> EntityViewNestedBuilder<E, BuilderType> withBuilder(SetAttribute<RefTypeViewBase, E> attr) {
        if (attr instanceof MethodAttribute) {
            return withSetBuilder(((MethodAttribute) attr).getName());
        } else {
            return withSetBuilder(((ParameterAttribute) attr).getIndex());
        }
    }

    @Override
    public <K, V> EntityViewNestedBuilder<V, BuilderType> withBuilder(MapAttribute<RefTypeViewBase, K, V> attr, K key) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName(), key);
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex(), key);
        }
    }

    @Override
    public <K, V> EntityViewNestedBuilder<K, EntityViewNestedBuilder<V, BuilderType>> withBuilder(MapAttribute<RefTypeViewBase, K, V> attr) {
        if (attr instanceof MethodAttribute) {
            return withMapBuilder(((MethodAttribute) attr).getName());
        } else {
            return withMapBuilder(((ParameterAttribute) attr).getIndex());
        }
    }


    public static class Init extends RefTypeViewBaseBuilder<EntityViewBuilder<RefTypeViewBase>> implements EntityViewBuilder<RefTypeViewBase> {

        public Init(Map<String, Object> optionalParameters) {
            super(optionalParameters);
        }

        @Override
        public RefTypeViewBase build() {
            return new RefTypeViewBaseImpl(
            this.id
            );
        }

        @Override
        public EntityViewBuilder<RefTypeViewBase> with(int parameterIndex, Object value) {
            switch (parameterIndex) {
                default:
                     throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
        }
    }

        @Override
        public <E> E get(int parameterIndex) {
            switch (parameterIndex) {
            }
            throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
        }

    @Override
    public <E> EntityViewNestedBuilder<E, EntityViewBuilder<RefTypeViewBase>> withSingularBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <E> EntityViewNestedBuilder<E, EntityViewBuilder<RefTypeViewBase>> withCollectionBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <E> EntityViewNestedBuilder<E, EntityViewBuilder<RefTypeViewBase>> withListBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <E> EntityViewNestedBuilder<E, EntityViewBuilder<RefTypeViewBase>> withListBuilder(int parameterIndex, int index) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <E> EntityViewNestedBuilder<E, EntityViewBuilder<RefTypeViewBase>> withSetBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <V> EntityViewNestedBuilder<V, EntityViewBuilder<RefTypeViewBase>> withMapBuilder(int parameterIndex, Object key) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <K, V> EntityViewNestedBuilder<K, EntityViewNestedBuilder<V, EntityViewBuilder<RefTypeViewBase>>> withMapBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }
    }

    public static class Nested<BuilderResult> extends RefTypeViewBaseBuilder<EntityViewNestedBuilder<RefTypeViewBase, BuilderResult>> implements EntityViewNestedBuilder<RefTypeViewBase, BuilderResult> {

        private final EntityViewBuilderListener listener;
        private final BuilderResult result;

        public Nested(Map<String, Object> optionalParameters, EntityViewBuilderListener listener, BuilderResult result) {
            super(optionalParameters);
            this.listener = listener;
            this.result = result;
        }

        @Override
        public BuilderResult build() {
            listener.onBuildComplete(new RefTypeViewBaseImpl(
            this.id
            ));
            return result;
        }

        @Override
        public EntityViewNestedBuilder<RefTypeViewBase, BuilderResult> with(int parameterIndex, Object value) {
        switch (parameterIndex) {
            default:
                throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
        }
    }

        @Override
        public <E> E get(int parameterIndex) {
            switch (parameterIndex) {
            }
            throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
        }

    @Override
    public <E> EntityViewNestedBuilder<E, EntityViewNestedBuilder<RefTypeViewBase, BuilderResult>> withSingularBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <E> EntityViewNestedBuilder<E, EntityViewNestedBuilder<RefTypeViewBase, BuilderResult>> withCollectionBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <E> EntityViewNestedBuilder<E, EntityViewNestedBuilder<RefTypeViewBase, BuilderResult>> withListBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <E> EntityViewNestedBuilder<E, EntityViewNestedBuilder<RefTypeViewBase, BuilderResult>> withListBuilder(int parameterIndex, int index) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <E> EntityViewNestedBuilder<E, EntityViewNestedBuilder<RefTypeViewBase, BuilderResult>> withSetBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <V> EntityViewNestedBuilder<V, EntityViewNestedBuilder<RefTypeViewBase, BuilderResult>> withMapBuilder(int parameterIndex, Object key) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }

    @Override
    public <K, V> EntityViewNestedBuilder<K, EntityViewNestedBuilder<V, EntityViewNestedBuilder<RefTypeViewBase, BuilderResult>>> withMapBuilder(int parameterIndex) {
        switch (parameterIndex) {
        }
        throw new IllegalArgumentException("Unknown parameter index: " + parameterIndex);
    }
    }
}

