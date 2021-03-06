---
title: Apache BookKeeper&trade; Releases
layout: community
---

{% capture root_url %}https://www.apache.org/dist/bookkeeper{% endcapture %}
{% capture latest_source_url %}{{ root_url }}/bookkeeper-{{ site.latest_release }}/bookkeeper-{{ site.latest_release }}-src.tar.gz{% endcapture %}
{% capture latest_bin_url %}{{ root_url }}/bookkeeper-{{ site.latest_release }}/bookkeeper-server-{{ site.latest_release }}-bin.tar.gz{% endcapture %}
{% capture stable_source_url %}{{ root_url }}/bookkeeper-{{ site.stable_release }}/bookkeeper-{{ site.stable_release }}-src.tar.gz{% endcapture %}
{% capture stable_bin_url %}{{ root_url }}//bookkeeper-{{ site.stable_release }}/bookkeeper-server-{{ site.stable_release }}-bin.tar.gz{% endcapture %}

Version **{{ site.latest_release }}** is the [latest release](#latest-releases-version-{{ site.latest_release | remove: "." }}) of BookKeeper. The current [stable version](#latest-stable-releases-version-{{ site.stable_release | remove: "." }}) is **{{ site.stable_release }}**. Releases can be downloaded from BookKeeper's [Apache mirrors](http://www.apache.org/dyn/closer.cgi/bookkeeper) site or using the instructions below.

> You can verify your download by following these [procedures](http://www.apache.org/info/verification.html) and using these [KEYS](https://www.apache.org/dist/bookkeeper/KEYS).

If you want to download older, archived releases, they are available in the [Apache archive](http://archive.apache.org/dist/bookkeeper/).

## Latest release (version {{ site.latest_release }})

Release | Link | Crypto files
:-------|:-----|:------------
Source | [bookkeeper-{{ site.latest_release }}-src.tar.gz]({{ latest_source_url }}) | [asc]({{ latest_source_url }}.asc), [md5]({{ latest_source_url }}.md5), [sha1]({{ latest_source_url }}.sha1)
Binary | [bookkeeper-server-{{ site.latest_release }}-bin.tar.gz]({{ latest_bin_url }}) | [asc]({{ latest_bin_url }}.asc), [md5]({{ latest_bin_url }}.md5), [sha1]({{ latest_bin_url }}.sha1)

## Latest stable release (version {{ site.stable_release }})

Release | Link | Crypto files
:-------|:-----|:------------
Source | [bookkeeper-{{ site.stable_release }}-src.tar.gz]({{ stable_source_url }}) | [asc]({{ stable_source_url }}.asc), [md5]({{ stable_source_url }}.md5), [sha1]({{ stable_source_url }}.sha1)
Binary | [bookkeeper-server-{{ site.stable_release }}-bin.tar.gz]({{ stable_bin_url }}) | [asc]({{ stable_bin_url }}.asc), [md5]({{ stable_bin_url }}.md5), [sha1]({{ stable_bin_url }}.sha1)

## Recent releases

{% for version in site.versions %}{% if version != site.latest_release %}
{% capture root_url %}https://www.apache.org/dist/bookkeeper/bookkeeper-{{ version }}{% endcapture %}
{% capture src_root %}{{ root_url }}/bookkeeper-{{ version }}-src.tar.gz{% endcapture %}
{% capture bin_root %}{{ root_url }}/bookkeeper-server-{{ version }}-bin.tar.gz{% endcapture %}
### Version {{ version }}

Release | Link | Crypto files
:-------|:-----|:------------
Source | [bookkeeper-{{ version }}-src.tar.gz]({{ src_root }}) | [asc]({{ src_root }}.asc), [md5]({{ src_root }}.md5), [sha1]({{ src_root }}.sha1)
Binary | [bookkeeper-server-{{ version }}-bin.tar.gz]({{ bin_root }}) | [asc]({{ bin_root }}.asc), [md5]({{ bin_root }}.md5), [sha1]({{ bin_root }}.sha1)
{% endif %}{% endfor %}

## Getting Started

Once you've downloaded a BookKeeper release, instructions on getting up and running with a standalone cluster that you can run your laptop can be found
in [Run BookKeeper locally]({{ site.baseurl }}docs/latest/getting-started/run-locally).

If you need to connect to an existing BookKeeper cluster using an officially supported client, see client docs for these languages:

Client Guide | API docs
:------------|:--------
[The BookKeeper Client]({{ site.baseurl }}docs/latest/api/ledger-api) | [Javadoc]({{ site.baseurl }}docs/latest/api/javadoc)
[The DistributedLog Library]({{ site.baseurl }}docs/latest/api/distributedlog-api) | [Javadoc](https://distributedlog.io/docs/latest/api/java)

## News

### 30 January, 2018: Release 4.6.1 available

This is the eighth release of BookKeeper as an Apache Top Level Project!

The 4.6.1 release is a bugfix release.

See [BookKeeper 4.6.1 Release Notes](../docs/4.6.1/overview/releaseNotes) for details.


### 27 December, 2017: Release 4.6.0 available

This is the seventh release of BookKeeper as an Apache Top Level Project!

The 4.6.0 release incorporates new fixes, improvements, and features since previous major release 4.5.0.

See [BookKeeper 4.6.0 Release Notes](../docs/4.6.0/overview/releaseNotes) for details.

### 22 November, 2017: Release 4.5.1 available

This is the sixth release of BookKeeper as an Apache Top Level Project!

The 4.5.1 release is a bugfix release.

See [BookKeeper 4.5.1 Release Notes](../docs/4.5.1/overview/releaseNotes) for details.

### 10 August, 2017: Release 4.5.0 available

This is the fifth release of BookKeeper as an Apache Top Level Project!

The 4.5.0 release incorporates hundreds of new fixes, improvements, and features since previous major release, 4.4.0,
which was released over a year ago. It is a big milestone in Apache BookKeeper community, converging from three
main branches (Salesforce, Twitter and Yahoo).

See [BookKeeper 4.5.0 Release Notes](../docs/4.5.0/overview/releaseNotes) for details.

### 16 May, 2016: release 4.4.0 available

This is the fourth release of BookKeeper as an Apache Top Level Project!

This release contains a total of 94 Jira tickets fixed and brings several bookie
reliability and operability improvements, along with a long list of bugfixes.

See [BookKeeper 4.4.0 Release Notes]({{ site.baseurl }}archives/docs/r4.4.0/releaseNotes.html) for details.

### 30 Nov, 2015: release 4.3.2 available

This is the third release of BookKeeper as an Apache Top Level Project!

This release fixes some issues in both bookie server and bookkeeper client.

See [BookKeeper 4.3.2 Release Notes]({{ site.baseurl }}archives/docs/r4.3.2/releaseNotes.html) for details.

### 27 May, 2015: release 4.3.1 available

This is the second release of BookKeeper as an Apache Top Level Project!

This release fixes some issues in both bookie server and bookkeeper client.

See [BookKeeper 4.3.1 Release Notes]({{ site.baseurl }}archives/docs/r4.3.1/releaseNotes.html) for details.

### 16 Jan, 2015: release 4.2.4 available

This is the first release of BookKeeper as an Apache Top Level Project!

This release fixes some critical issues in fencing when the ack quorum and write quorum are different sizes.

See [BookKeeper 4.2.4 Release Notes]({{ site.baseurl }}archives/docs/r4.2.4/releaseNotes.html) for details.

### 14 Oct, 2014: release 4.3.0 available

This is the seventh release of BookKeeper as a subproject of Zookeeper.

This release includes a lot of improvements to the bookie on-disk performance, a new statistics framework, and protobuffer protocol support along with numerous bugfixes.

See [BookKeeper 4.3.0 Release Notes]({{ site.baseurl }}archives/docs/r4.3.0/releaseNotes.html) for details.

### 27 June, 2013: release 4.2.3 available

This is the sixth release of BookKeeper as a subproject of Zookeeper.

This is a bugfix release for 4.2.2.

Notable fixes and improvements include new utilities to give administrators better visibility of cluster state (BOOKKEEPER-746),
improvements to allow for smoother rolling upgrades (BOOKKEEPER-745),
fixes to ledger polling to ensure metadata updates aren't missed (BOOKKEEPER-710 & BOOKKEEPER-747) and shading of protobuf libraries
to avoid conflicts when included with other version (BOOKKEEPER-708).

See [BookKeeper 4.2.3 Release Notes]({{ site.baseurl }}archives/docs/r4.2.3/releaseNotes.html) for details.

### 9 Oct, 2013: release 4.2.2 available

This is the fifth release of BookKeeper as a subproject of Zookeeper.

This is a bugfix release for 4.2.1. There are some minor API improvements. Notably, it is now possible to check whether a ledger is closed without opening it, and it is now possible to get a list of ledgers available in the cluster.

See [BookKeeper 4.2.2 Release Notes]({{ site.baseurl }}archives/docs/r4.2.2/releaseNotes.html) for details.

### 27 Feb, 2013: release 4.2.1 available

This is the fourth release of BookKeeper as a subproject of Zookeeper.
*This release fixes a major performance bug in release 4.2.0. All users of BookKeeper 4.2.0 should upgrade immediately.*

See [BookKeeper 4.2.1 Release Notes]({{ site.baseurl }}archives/docs/r4.2.1/releaseNotes.html) for details.

### 18 Jan, 2013: release 4.2.0 available

This is the third release of BookKeeper as a subproject of Zookeeper.
See [BookKeeper 4.2.0 Release Notes]({{ site.baseurl }}archives/docs/r4.2.0/releaseNotes.html) for details.

### 12 Jun, 2012: release 4.1.0 available

This is the second release of BookKeeper as a subproject of Zookeeper.
See [BookKeeper 4.1.0 Release Notes]({{ site.baseurl }}archives/docs/r4.1.0/releaseNotes.html) for details.

### 7 Dec, 2011: release 4.0.0 available

This is the first release of BookKeeper as a subproject of Zookeeper.
See [BookKeeper 4.0.0 Release Notes]({{ site.baseurl }}archives/docs/r4.0.0/releaseNotes.html) for details.