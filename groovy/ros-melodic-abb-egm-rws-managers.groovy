node {
    git url: "https://github.com/ros-industrial/abb_egm_rws_managers.git", branch: "master"
    registerROS('ros:melodic-ros-base',
        ['libprotobuf-dev', 'protobuf-compiler', 'ros-melodic-abb-libegm', 'ros-melodic-abb-librws'],
        ['ros-melodic-abb-libegm', 'ros-melodic-abb-librws']
    )
}
