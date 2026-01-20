node {
    git url: 'https://github.com/ros-industrial/staubli_experimental.git', branch: 'kinetic-devel'
    registerROS('ros:noetic-desktop-full', [
        'ros-noetic-staubli',
        'ros-noetic-industrial-robot-client',
        'ros-noetic-moveit-core'
    ], [])
}
