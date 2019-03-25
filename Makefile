SUBDIRS=hello fizzbuzz stdin
CLEAN_SUBDIRS=$(patsubst %,clean-%,$(SUBDIRS))

all: $(SUBDIRS)
$(SUBDIRS):
	$(MAKE) -C $@ all

clean: $(CLEAN_SUBDIRS)
$(CLEAN_SUBDIRS):
	dir=`echo $@ |sed -e 's/clean-//'`; \
	$(MAKE) -C $${dir} clean

.PHONY: all $(SUBDIRS) clean $(CLEAN_SUBDIRS)
