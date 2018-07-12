#! /bin/sh

hiptest-publisher \
  --config-file hiptest-publisher.config \
  --push "build/reports/cucumber-junit/*.xml" \
  --push-format junit
