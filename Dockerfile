FROM openjdk:11

ARG PROFILE
ARG ADDT_OPTS

ENV PROFILE=${PROFILE}
ENV ADDT_OPTS=${ADDT_OPTS}

WORKDIR c: