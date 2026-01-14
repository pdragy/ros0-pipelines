node {
    git url: 'https://github.com/ros-industrial/abb_egm_rws_managers.git', branch: 'master'
    registerROS('ros:noetic-ros-base',
        ['protobuf-compiler', 'ros-noetic-abb-libegm', 'ros-noetic-abb-librws'],
        ['ros-noetic-abb-libegm', 'ros-noetic-abb-librws']
    )
}
