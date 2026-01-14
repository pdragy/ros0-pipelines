node {
    git url: 'https://github.com/ros-industrial/abb_egm_rws_managers.git', branch: 'master'
    registerROS('ros:jazzy-ros-base',
        ['libpoco-dev', 'protobuf-compiler', 'ros-jazzy-abb-libegm', 'ros-jazzy-abb-librws'],
        ['ros-jazzy-abb-libegm', 'ros-jazzy-abb-librws']
    )
}
